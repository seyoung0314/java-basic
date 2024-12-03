import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Test {

    // ASCII 문자를 그레이스케일에 매핑하기 위한 문자 세트
    private static final String ASCII_CHARS = "@#S%?*+;:,. ";

    public static void main(String[] args) {
        try {
            // 이미지를 읽어오기
            BufferedImage image = ImageIO.read(new File("C:\\Users\\user\\Pictures\\apple-icon.png")); // 파일 경로 설정
            // 이미지 크기 조정 (너비는 100으로 고정)
            image = resizeImage(image, 100);

            // 이미지를 ASCII 아트로 변환하여 출력
            String asciiArt = convertToAscii(image);
            System.out.println(asciiArt);
        } catch (IOException e) {
            System.out.println("이미지 파일을 읽을 수 없습니다.");
            e.printStackTrace();
        }
    }

    // 이미지 크기 조정 함수 (너비에 맞게 높이도 비율에 맞춰 조정)
    private static BufferedImage resizeImage(BufferedImage originalImage, int targetWidth) {
        int targetHeight = (int) ((double) originalImage.getHeight() / originalImage.getWidth() * targetWidth);
        Image scaledImage = originalImage.getScaledInstance(targetWidth, targetHeight, Image.SCALE_DEFAULT);
        BufferedImage resizedImage = new BufferedImage(targetWidth, targetHeight, BufferedImage.TYPE_INT_RGB);
        resizedImage.getGraphics().drawImage(scaledImage, 0, 0, null);
        return resizedImage;
    }

    // 이미지를 ASCII 아트로 변환
    private static String convertToAscii(BufferedImage image) {
        StringBuilder asciiArt = new StringBuilder();

        for (int y = 0; y < image.getHeight(); y++) {
            for (int x = 0; x < image.getWidth(); x++) {
                // 픽셀의 색상값을 가져옴
                int pixel = image.getRGB(x, y);
                Color color = new Color(pixel);

                // 그레이스케일로 변환 (R, G, B 평균값)
                int grayValue = (int) (color.getRed() * 0.3 + color.getGreen() * 0.59 + color.getBlue() * 0.11);

                // 그레이스케일 값을 ASCII 문자로 매핑
                char asciiChar = mapGrayToAscii(grayValue);

                // ASCII 문자를 출력
                asciiArt.append(asciiChar);
            }
            // 한 줄이 끝나면 줄 바꿈
            asciiArt.append("\n");
        }

        return asciiArt.toString();
    }

    // 그레이스케일 값에 대응하는 ASCII 문자 반환
    private static char mapGrayToAscii(int grayValue) {
        // 그레이스케일 값은 0~255 사이의 값임. 0은 검정, 255는 흰색
        int index = (int) ((grayValue / 255.0) * (ASCII_CHARS.length() - 1));
        return ASCII_CHARS.charAt(index);
    }
}
