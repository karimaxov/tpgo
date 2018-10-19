package test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Karim on 17/10/2018.
 */
public class Solution {

    private Objet[] objets;
    private List<Objet> resultat= new ArrayList<Objet>();
    private int[][] C;
    private int w;

    public Solution(Objet[] objets) {
        this.objets = objets;
    }


    public int P_rec(int i, int j) {
        if (i == 0 || j == 0) {
            return 0;
        } else if (j < this.objets[i].getPoids()) {
            return P_rec(i - 1, j);
        } else {
            return Math.max(P_rec(i - 1, j), P_rec(i - 1, j - objets[i].getPoids()) + objets[i].getCout());
        }

    }

    public Solution(Objet[] objets, int w) {
        this.w =w;
        this.objets = objets;

        C = new int[objets.length][w+1];

        for(int i=0;i<objets.length;i++)C[i][w]=0;
        for(int i=0;i<w+1;i++)C[objets.length-1][i]=0;
    }
    public int P_it(){
        for(int i=1;i<objets.length;i++)
            for (int j=1;j<w+1;j++){
                if(objets[i].getPoids()>j){
                    C[i][j] = C[i-1][j];
                }
                else {

                    C[i][j] = Math.max(C[i-1][j],C[i-1][j-objets[i].getPoids()]+objets[i].getCout());

                }
            }

        return C[objets.length-1][w];
    }

    public void afficherResultat(){
        int j=1,k=objets.length-2;
        while(j<w+1){
            while(k>0 && C[k+1][j]==C[k][j]){
                k--;
            }
            if(k!=0){
                resultat.add(objets[k+1]);
            }
            k=objets.length-2;
            j++;
        }
        for (int i=0;i<resultat.size();i++) {
            System.out.println(resultat.get(i).getName()+" ---> "+resultat.get(i).getCout());
        }
    }
}
