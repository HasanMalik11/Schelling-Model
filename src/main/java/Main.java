package main.java;

import org.apache.commons.cli.*;

import javax.imageio.ImageIO;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Main {

    private static int width, height, numRaces, steps;
    private static double threshold;

    public static void main(String[] args) throws InterruptedException, IOException, ParseException {

        steps = 75;
        width = 350;
        height = 350;
        numRaces = 2;
        //Threshhold decides whether or not an agent feels comfortable being surrounded by deifferent agents
        threshold = 0.2;

        //UI
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the height: ");
        height = scanner.nextInt(); 

        System.out.println("Please enter the width: ");
        width = scanner.nextInt(); 

        System.out.println("Please enter the number of iterations you would like to occur: ");
        steps = scanner.nextInt(); 

        System.out.println("Please enter the number of races you would like: ");
        numRaces = scanner.nextInt(); 

        System.out.println("Please enter the threshold: ");
        threshold = scanner.nextDouble();

        System.out.println(width + " " + height);
        World world = new World(width, height, numRaces, threshold);

        //Generate images into /images folder
        for (int i = 0; i < steps; i++) {
            File f = new File("images/" + String.format("%03d", i) + ".png");
            f.mkdirs();
            ImageIO.write(world.getImage(), "PNG", f);
            world.step();
        }

        GifBuilder gif = new GifBuilder();
        
        gif.BuildGif();

        scanner.close();
        
    }

}
