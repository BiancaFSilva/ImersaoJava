import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

public class StickerGenerator 
{
    public void createSticker(InputStream inputStream, String archiveName) throws IOException 
    {
        /* Leitura de imagem
        InputStream inputStream = new FileInputStream(new File("input/TopMovies.jpg")); 
        InputStream inputStream = new URL("https://imersao-java-apis.s3.amazonaws.com/TopMovies_3.jpg").openStream(); */
        BufferedImage originalImg =  ImageIO.read(inputStream);

        // Criação de imagens com transparência redimencionadas
        int width = originalImg.getWidth();
        int height = originalImg.getHeight();
        int newHeight = height + 200;

        BufferedImage newTranslucentImg = new BufferedImage(width, newHeight, BufferedImage.TRANSLUCENT);

        // Copiar imagem original para gerar nova imagem (em memória)
        Graphics2D graphics = (Graphics2D) newTranslucentImg.getGraphics();
        graphics.drawImage(originalImg, 0, 0, null);

        // Configuração do texto
        var font = new Font(Font.SANS_SERIF, Font.BOLD, 64);
        graphics.setColor(Color.YELLOW);
        graphics.setFont(font);

        // Escrever/desenhar na imagem
        graphics.drawString("Imersão Java", 100, newHeight - 100);

        // Gravar imagem em um novo arquivo
        ImageIO.write(newTranslucentImg, "png", new File("output/" + archiveName));
    }
}