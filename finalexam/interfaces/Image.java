package exams.spring2017.solution.finalexam.interfaces;

public interface Image extends Comparable <Image>{
    
    public abstract void setWidth(int width);
    public abstract int getWidth();
    
    public abstract void setHeight(int height);
    public abstract int getHeight();
    
    public abstract void setName(String name);
    public abstract String getName();
    
    public abstract Pixel [][] getImg();
       
    public abstract void randomize();
}
