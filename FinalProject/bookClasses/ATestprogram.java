import java.awt.*;
//import java.awt.font.*;
//import java.awt.geom.*;
//import java.awt.image.BufferedImage;
//import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

public class ATestprogram
{
/**
* Test Main.  It will ask you to pick a file and then show it
*/
public static void main( String args[])
{
	final double FACTOR = .5;

	//Picture p = new Picture(FileChooser.pickAFile());
	//PictureExplorer test = new PictureExplorer(p);

	//opening and accessing pictures
    Picture beach = new Picture("beach.jpg");
    Picture baby = new Picture("tcatfourmonths.jpg");
    Picture cata = new Picture("caterpillar.jpg");

 //displaying picture
 	beach.show();
    beach.explore();
    cata.explore();
    //baby.explore();













/*

	//array of pixels [] used to index
	int[] numbers = new  int[10];
    Pixel [] pixels;
    pixels = baby.getPixels();
    System.out.println(pixels.length  );

	System.out.println(numbers[5] +"-1"  );


/*
	//accessing an array of int's
	for (int i = 0; i< numbers.length; i++)
	{
		numbers[i] = (int)(Math.random()*100);
		System.out.println(numbers[i]  );
	}


	System.out.println(numbers[5] +"-2"  );
















/*
	//access each index
	System.out.println(pixels[17]);
    System.out.println(pixels[17].getColor());

    pixels[17].setColor(Color.blue);
    pixels[20].setColor(new Color(150,150,150));

    baby.explore();


	// two loops to access indexes of array or collection

	//for each loop spot  is a ?
    //for (Pixel spot : pixels)
    //	System.out.println( spot );


	//loop indexes the array to access
    //for (int i = 0; i< pixels.length;i++)
    //	System.out.println(pixels[i].getRed()  );








 /*

    //clear the red from a picture
    for (Pixel pixelObj : pixels)
		{
					//set the red value of the current pixel to the new value
			pixelObj.setRed(0);

		}
	baby.explore();



// reduce the Red amount in Picture
/*
int value;
	for (Pixel pixelObj : pixels)
	{



		//get the redvalue
		value = pixelObj.getRed();
		//System.out.println(value);

		//decrease the red value by 50%
		value = (int) (value *0.5);

		//set the red value of the current pixel to the new value
		pixelObj.setRed(value);

	}
	beach.explore();
*/

/*
int redValue , blueValue, greenValue = 0;
for (Pixel pixelObj : pixels)
	{
		redValue = pixelObj.getRed();
		blueValue = pixelObj.getBlue();
		greenValue = pixelObj.getGreen();

		pixelObj.setColor(new Color( 255 - redValue,
									 255 - greenValue,
									 255 - blueValue));

	}

	baby.explore();





/*

	for (Pixel spot : pixels)
	{
		if (spot.getRed() > 150)
			spot.setRed(spot.getRed() - Math.abs(spot.getRed()-150)/2);
		else if (spot.getRed()<150)
			spot.setRed(spot.getRed()+ Math.abs(spot.getRed()-150)/2);
	}

	for (Pixel spot : pixels)
	{
		if (spot.getBlue() > 150)
			spot.setBlue(spot.getBlue()-Math.abs(spot.getBlue()-150)/2);
		else if (spot.getBlue()<150)
			spot.setBlue(spot.getBlue()+ Math.abs(spot.getBlue()-150)/2);
	}


	for (Pixel spot : pixels)
	{
		if (spot.getGreen() > 150)
			spot.setGreen(spot.getGreen()-Math.abs(spot.getGreen()-150)/2);
		else if (spot.getGreen()<150)
			spot.setGreen(spot.getGreen()+ Math.abs(spot.getGreen()-150)/2);
	}
	beach.explore();








/**/
}//end of main
}//end of class








