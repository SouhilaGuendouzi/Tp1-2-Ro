package com.company;

public class Matrice_Incidence {

    void Afficher_Incidence(Graphe graphe) // je decouvre que les i se sont les colonnes et ls j se sont les lignes
    {
        String [][] Tab = new String [graphe.arc.size()+1][graphe.sm.size()+1];
        int i,j;
        Tab[0][0]=" ";
        for (i=1;i<=graphe.Nbr_Arc;i++)
            Tab[i][0] = graphe.arc.get(i-1).Nom;
        for (j=1;j<=graphe.Nbr_Sommet;j++)
            Tab[0][j]= graphe.sm.get(j-1).title;
        if (graphe.Type.equals("Oriente")) {
            for (i = 1; i <=graphe.arc.size(); i++) //colonne
            for (j = 1; j <=graphe.sm.size(); j++) //ligne

                 //i------> colonne
                //j---->ligne

                // je sais que graphe.arc.get(k).title=Tab[k+1][0]
                {
                    if (graphe.arc.get(i-1).s1.title.equals(Tab[0][j])) Tab[i][j]="-1";
                      else if (graphe.arc.get(i-1).s2.title.equals(Tab[0][j])) Tab[i][j]="1";
                        else Tab[i][j]="0";
                }

        }
        else if(graphe.Type.equals("Non_Oriente"))
        {
            for (i = 1; i <=graphe.arc.size(); i++) //colonne
                for (j = 1; j <=graphe.sm.size(); j++) //ligne

                //i------> colonne
                //j---->ligne

                // je sais que graphe.arc.get(k).title=Tab[k+1][0]
                {
                    if ((graphe.arc.get(i-1).s1.title.equals(Tab[0][j]))|| (graphe.arc.get(i-1).s2.title.equals(Tab[0][j])))Tab[i][j]="1";
                    else Tab[i][j]="0";
                }
        }
        System.out.println("MATRICE_INCIDENCE");
        for (i=0;i<graphe.arc.size()+1;i++)
        {
            for (j=0;j<graphe.sm.size()+1;j++)
            {
                if (j==graphe.Nbr_Sommet) System.out.println(Tab[i][j]+"\n");
                else System.out.print(Tab[i][j]+"\t");
            }

        }
    }

}
