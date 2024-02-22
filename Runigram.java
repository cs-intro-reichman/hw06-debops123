// This class uses the

// which is part of Java's standard class library.
import java.awt.Color;

/**  A library of mage processing functions. */
public class Runigram {

        public static void main(String[] args) {

                 //// H ide / change / add to the testing code below, as needed.

                // Tests the reading and printing of an image: 
                 Colo
		         print(tinypic);
                Color[][] cake = read
		         //print(
		        Color[][]
		         Color[][] iron = read("ironman.ppm");
                //print(thor);
                 // Creates an image which will be the result of various
                // image processing operations:
                Color[][] imageOut;

                 // Tests the horizontal flipping of an image:
                //imageOut = flippedHorizontally(tinypic);
                //System.out.println();
                //print(imageOut);

                //imageOut = flippedVertically(tinypic);
                 //System.out.println();
                //pri nt (imageOut);

  

	   
	 *            //System.out.println();
                //print(imageOut)
	 

                //imageOut = scaled(tinypic, 7, 9);
                //System.out.println();
                //print(imageOut);

                //imageOut = morph(Color args[0], Color args[1], 10);
                //System.out.println();
                //print(imageOut);

		              //// You can reuse / overide the contents of t
		      }

        /** Returns a 2D array of Color values, representing the image data
          *  s tred   in the iven P PM file. */
         publ i csta t ic Colo[][] r e
				             In in = ne
				              // Reads th
				              in.readString();
                int numCols = in.readInt();
                int numRows = in.readInt();
                in.readInt();
                // Creates the image array
  

	            // Reads the RGB values from the file, into the image array.
                // For each pixel (i,
		           // creates from the 3 colors a new Color object, and
                // makes pixel (i,j) ref to that object.
                //// Replace the following statement with your code.
		        for (int i = 0;  < numRows; i+  {
		                for (int j = 0; j < numCols; j++) {
  

	                               int colorGreen = in.readInt();
                                int colorBlue = in. readInt();
                                Color pixel = new Color(colorRed, colorGreen, colorBlue);
                                image[i][j] = pixel;
                        }
	// 
                }
                  r e turn image;
         }    

    // Prints the RGB values of a given color.
        private static void print(Color c) {
  

	               System.out.printf("%3s,", c.getGreen()); // Prints the green component
        System.out.printf("%3s",  c.getBlue());  // Prints the blue compone
	 * t
	       System.out.print(")  ");
        }

         //  P rnts   the pixels o the given image.
         // E a c pi x el is printed a a triplet of (r,g,b) values.
        // This function is used for deb u g g ing purposes.
        // For example, to check that some image processing function works correctly,
  

	               for (int i = 0; i < image.length; i++) {
                        for (int j = 0; j < image[0].length; j++) {
	                               print(image[i][j]);
                        } 
                        System.out.println();
                  }  
         }    
				    
        /**
  

	       public static Color[][] flippedHorizontally(Color[][] image) {
	// 
	               Color[][] ans = new Color[image.length][image[0].length
	// ;
                for (int i = 0; i < image.length; i++) {
                        for (int j = 0; j < image[0].length; j++) {
                                 ans[i][j] = image[i][image[0].length - j -1];
                        }
  

	       }

        /**
         * Returns an image which is the vertically flipped version of the given image.
         */
         pub l i st a tic Color[][ flippedVertically(Color[][] image){
                  Co l or[][] ans = ne Color[image.length][image[0].length];
                for (int i = 0; i < image.length; i++) {
                        for (int j = 0; j < image[0].length; j++) {
  

	               }
                return ans;
	       }

        // Computes the luminance of the RGB values of the given pixel, using the formula
        // lum = 0.299 * r + 0.587 * g + 0.114 * b, and returns a Color object consisting
         //  t h th r ee vales r = lum, g = lum, b = lum.
         publ i csta t ic Coor luminance(Color pixel) {
                int colorRed = pixe l. getRed(); 
                int colorGreen = pixel.getGreen();
  

	               Color lumedPixel = new Color(lum, lum ,lum);
                return lumedPixel;
	 * 
        }
	 * 
	 
	 * 
        /**
         * Returns an image which is the grayscaled version of the given image.
         */
        public  static   Color[][] graySc a led(Co l or[][] image) {
                 Color [ ][] ans = new Colo r [image . length][image[0].length];
                 for ( i nt i = 0; i < ima g e.leng t h; i++) {
                        for (int j = 0; j < image[0].length; j++) {
  

	               }
                return ans;
	 * 
        }       
	 * 

        /**
         * Returns an image which is the scaled version of the given image.
         * The image is scaled (resized) to have the given width and height.
         */
         pub l i st a tic Color[][]scaled(Color[][] image, int width, int height) {
                  Co l or[][] ans = newColor[height][width];
                int initialHeight = image.length;
                int initialWidth = image[0].length;
  

	                       for (int j = 0; j < width; j++) {
                                ans[i][j] = image[i * initialHeight/height][j * initialWidth/width];
                        }
                }
                return ans;
        }

        /**
          *  C oput e sand returns a blended color which is a linear combination of the two given
         * colors. Each r, g, b, valu e  v  i n  the returned color is calculated using the formula
         * v = alpha * v1 + (1 - alpha) * v2, where v1 and v2 are the corresponding r, g, b
         * values in the two input color.
  

	               int blendRed = (int)(alpha * c1.getRed() +  (1-alpha) * c2.getRed());
                int blendGreen = (int)(alpha * c1.getGreen() + (1-alpha) * c2.getGreen());
                 int blendBlue = (int)(alpha * c1.getBlue() + (1-alpha) * c2.getBlue());
                Color lumedPixel = new Color(blendRed, blendGreen , blendBlue);
                return lumedPixel;
        }

        /**
		 * Cosntructs and returns an image which is the blending of the two given images.
         * The blended image is the linear combination of (alpha) part of the first image
         * and (1 - alpha) part the second image.
  

	        */
        public static Color[][] blend(Color[][] image1, Color[][] image2, double alpha) {
                Color[][] ans = new Color[image1.length][image1[0].length];
                for (int i = 0; i < image1.length; i++) {
                        for (int j = 0; j < image1[0].length; j++) {
                                ans[i][j] = blend(image1[i][j], image2[i][j], alpha);
                        }
                }
						 ans;
						

        /**
         * Morphs the source image into the target image, gradually, in n steps.
         * Animates the morphing process by displaying the morphed image in each step.
         * Before starting the process, scales the target image to the dimensions
         * of the source image.
         */
        public static void morph(Color[][] source, Color[][] target, int n) {
                if(target.length != source.length || target[0].length != source[0].length){
                        target = scaled(target, source[0].length, source.length);
                }
                Color[][] blended = new Color[source.length][source[0].length];
                for (int i = 0; i < n; i++){
                        double alpha = (double)((n - i)/n);
                        blended = blend(source, target, alpha);
                        display(blended);
                        StdDraw.pause(500);
                }
        }

        /** Creates a canvas for the given image. */
        public static void setCanvas(Color[][] image) {
                StdDraw.setTitle("Runigram 2023");
                int height = image.length;
                int width = image[0].length;
                StdDraw.setCanvasSize(height, width);
                StdDraw.setXscale(0, width);
                StdDraw.setYscale(0, height);
        // Enables drawing graphics in memory and showing it on the screen only when
                // the StdDraw.show function is called.
                StdDraw.enableDoubleBuffering();
        }

        /** Displays the given image on the current canvas. */
        public static void display(Color[][] image) {
                int height = image.length;
                int width = image[0].length;
                for (int i = 0; i < height; i++) {
                        for (int j = 0; j < width; j++) {
                                // Sets the pen color to the pixel color
                                StdDraw.setPenColor( image[i][j].getRed(),
                                                         image[i][j].getGreen(),
                                                         image[i][j].getBlue() );
                                // Draws the pixel as a filled square of size 1
                                StdDraw.filledSquare(j + 0.5, height - i - 0.5, 0.5);
                        }
                }
                StdDraw.show();
        }
}