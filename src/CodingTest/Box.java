package CodingTest;

public class Box {
    
    private int width, height;
    private char fillchar;
    public Box(int width,int height){
        this.height = height;
        this.width = width;
    }
    public void draw(){
        for(int i = 0; i<height; i++){
            for(int j = 0; j<width; j++){
                System.out.print("%");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        Box box = new Box(20, 3);

        box.draw();

    }
}
