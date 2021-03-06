package exams.spring2017.solution.finalexam.core;

import exams.spring2017.solution.finalexam.interfaces.Image;
import exams.spring2017.solution.finalexam.interfaces.Pixel;
import exams.spring2017.solution.finalexam.interfaces.RGBColor;
import exams.spring2017.solution.finalexam.interfaces.RGBImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class RGBImageImpl extends ImageImpl implements RGBImage{
    
    private Pixel [][]  img ;
    
    private int maxColor = 255;
    
    public RGBImageImpl(int width, int height, String name) {
        super(width, height, name);
        img = new RGBPixelImpl[height][width];
    }
    
    public RGBImageImpl(RGBImageImpl im) {
        super(im.getWidth(),im.getHeight(),im.getName());
        img = new RGBPixelImpl[im.getHeight()][im.getWidth()];
        img = im.getImg();
    }

    public Pixel[][] getImg() {
        return img;
    }

    public void setImg(RGBPixelImpl[][] img) {
        this.img = img;
    }

    @Override
    public void randomize() {
        //System.out.println("here");
        for (int i=0;i<getHeight();i++){
               for (int j=0;j<getWidth();j++){
                   
                   img[i][j]= new RGBPixelImpl(new RGBColorImpl(
                           (int)(Math.random()*maxColor),
                           (int)(Math.random()*maxColor), 
                           (int)(Math.random()*maxColor)));
                   //System.out.println(img[i][j].getColor());
               }
            }
    }
    
    public String toString(){
        return String.format("Color %s",super.toString());
    }
    /*
    public boolean imwrite(String filename) {
        try {
            FileWriter fw = new FileWriter(new File(filename));

            
            for (int i=0;i<getHeight();i++){
               for (int j=0;j<getWidth();j++){
                   byte R= img[i][j].getRed();
                   byte G= img[i][j].getGreen();
                   byte B= img[i][j].getBlue();
                   String color = String.format("%s%s%s", Integer.toHexString(R),
                           Integer.toHexString(G),Integer.toHexString(B));
                   fw.write(color+" ");
               }
               fw.write("\n");
            }
            fw.close();
            return true;
        } catch (IOException ex) {
            System.out.println("Image IO Exception");
            return false;
        }        
    }
*/

   
}
