import java.util.Arrays;
public class main{
public static void addEdge(int[] mat,int i,int j){
mat[i][j]=1;
mat[j][i]=1;
}
public static void daisplayMatrix(int[]mat){
for(int[]row:mat){
for(int va1:row){
System.out.print(va1+"");
}
System.out.println();
}
}
public static void main(String[] args){
int V=4;
int[][]mat=new int[v][v];
addEdge(mat,0,1);
addEdge(mat,0,2);
addEdge(mat,1,2);
addEdge(mat,2,3);
int[][]mat={{0,1,0,1},
           {1,0,1,0},
		   {0,1,0,1},
           {0,0,1,0}};
System.out.println("Adjacency matrix Representation");
displayMatrix(mat);
}
}
