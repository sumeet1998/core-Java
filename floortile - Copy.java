/* 42.	Create a class Tile to store the edge length of a square tile, 
and create another class Floor to store length and width of a rectangular
floor. Add method totalTiles(Tile t) in Floor class with Tile as 
argument to calculate the whole number of tiles needed to cover the 
floor completely.
*/

import java.util.Scanner;

class tile{
    public int edgelength;

    void sizeoftile(int edgelength){
        
        int stile = edgelength*edgelength;
        // return stile;
    }


}

class floor{
    int length;
    int width;

    floor(int length,int width){
        this.length=length;
        this.width=width;
    }

    void Areaoffloor(){
        
        float area = length*width;
      

    }

    void totalTiles(Tile t){
        // super();
        float total = (area/t);
    }

}

class floortile{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the edgelength of tile in cm");
        int s = sc.nextInt();

        tile t1 = new tile();
        int z = t1.sizeoftile(s);

        floor f1 = new floor(20,30);
        f1.Areaoffloor(z);

        // System.out.println(f1.totalTiles);

       
    }
}