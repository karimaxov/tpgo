package test;

public class Main {
/*
P(i,j)= le gain max generé par le choix des I premiers objets dont la somme des poids ne depasse pas J
on cherche P(n,w)
*/
/*static int N=10,W=100;

public static int P(int i,int j){
    if(i==0 || j==0){
        return 0;
    }else if(j<wi ){

    }else{
        return Math.max(P(i-1,j),P(i-1,j-wi))
    }
}*/

    public static void main(String[] args) {
	// write your code here
        Solution sol = new Solution(new Objet[]{
                new Objet("null",0,0),
                new Objet("a",3,2),
                new Objet("b",1,1),
                new Objet("c",3,3),
                new Objet("d",4,4),
                new Objet("e",7,2),
                new Objet("f",10,4),
                new Objet("g",1,1),
                new Objet("h",2,3)
        },6);
        System.out.println(sol.P_rec(8,6));
        System.out.println(sol.P_it());
        sol.afficherResultat();
    }
}
