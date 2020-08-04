package main.java;

import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageOutputStream;
import javax.imageio.stream.ImageOutputStream;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class GifBuilder {

    public GifBuilder(){

    }

    public void BuildGif() throws IOException {
        BufferedImage first = ImageIO.read(new File("images/000.png"));
        ImageOutputStream output = new FileImageOutputStream(new File("images/example.gif"));

        GifSequenceWriter writer = new GifSequenceWriter(output, first.getType(), 250, true);

        writer.writeToSequence(first);

        File[] images = new File[]{
            new File("images/001.png"),
            new File("images/002.png"),
            new File("images/003.png"),
            new File("images/004.png"),
            new File("images/005.png"),
            new File("images/006.png"),
            new File("images/007.png"),
            new File("images/008.png"),
            new File("images/009.png"),
            new File("images/010.png"),
            new File("images/011.png"),
            new File("images/012.png"),
            new File("images/013.png"),
            new File("images/014.png"),
            new File("images/015.png"),
            new File("images/016.png"),
            new File("images/017.png"),
            new File("images/018.png"),
            new File("images/019.png"),
            new File("images/020.png"),
            new File("images/021.png"),
            new File("images/022.png"),
            new File("images/023.png"),
            new File("images/024.png"),
            new File("images/025.png"),
            new File("images/026.png"),
            new File("images/027.png"),
            new File("images/028.png"),
            new File("images/029.png"),
            new File("images/030.png"),
            new File("images/031.png"),
            new File("images/032.png"),
            new File("images/033.png"),
            new File("images/034.png"),
            new File("images/035.png"),
            new File("images/036.png"),
            new File("images/037.png"),
            new File("images/038.png"),
            new File("images/039.png"),
            new File("images/040.png"),
            new File("images/041.png"),
            new File("images/042.png"),
            new File("images/043.png"),
            new File("images/044.png"),
            new File("images/045.png"),
            new File("images/046.png"),
            new File("images/047.png"),
            new File("images/048.png"),
            new File("images/049.png"),
            new File("images/050.png"),
            new File("images/051.png"),
            new File("images/052.png"),
            new File("images/053.png"),
            new File("images/054.png"),
            new File("images/055.png"),
            new File("images/056.png"),
            new File("images/057.png"),
            new File("images/058.png"),
            new File("images/059.png"),
            new File("images/060.png"),
            new File("images/061.png"),
            new File("images/062.png"),
            new File("images/063.png"),
            new File("images/064.png"),
            new File("images/065.png"),
            new File("images/066.png"),
            new File("images/067.png"),
            new File("images/068.png"),
            new File("images/069.png"),
            new File("images/070.png"),
            new File("images/071.png"),
            new File("images/072.png"),
            new File("images/073.png"),
            new File("images/074.png"),
            //new File("images/075.png"),
        };

        for (File image : images) {
            BufferedImage next = ImageIO.read(image);
            writer.writeToSequence(next);
        }

        writer.close();
        output.close();

    }
}

