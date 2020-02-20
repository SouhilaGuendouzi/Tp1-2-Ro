package com.company;

public class Matrice_Ponderation {
    String [][] MAtrice;



    public void AffiChage_Ponderation( Graphe graphe )
    { String [][] Tab = new String [graphe.sm.size()+1][graphe.sm.size()+1];
        int i,j;
        Tab[0][0]=" ";
        for (i=1;i<=graphe.Nbr_Sommet;i++)
            Tab[0][i] = graphe.sm.get(i-1).title;
        for (i=1;i<=graphe.Nbr_Sommet;i++)
            Tab[i][0]= graphe.sm.get(i-1).title;



        if (graphe.Type.equals("Oriente")) {
            for (i = 1; i < Tab.length; i++) //ligne

                for (j = 1; j < Tab.length; j++)//colonne

                { int k = 0;
                    boolean stop=false;
                    while ((k < graphe.arc.size())&&(stop==false))
                    {
                        if ((graphe.arc.get(k).s1.title.equals(Tab[i][0])) &&(graphe.arc.get(k).s2.title.equals(Tab[0][j])))
                        {
                            Tab[i][j] = String.valueOf(graphe.arc.get(k).poid);
                            stop =true;
                        }
                        else
                            if (i==j) Tab[i][j] = "0";
                              else Tab[i][j] = "99";
                        k++;
                    }

                }
        }
        else if(graphe.Type.equals("Non_Oriente")) {
            for (i = 1; i < Tab.length; i++) //ligne

                for (j = 1; j < Tab.length; j++) //colonne

                {
                    int k = 0;
                    boolean stop = false;
                    while ((k < graphe.arc.size()) && (stop == false)) {

                        if (((graphe.arc.get(k).s1.title.equals(Tab[i][0])) && (graphe.arc.get(k).s2.title.equals(Tab[0][j]))) || ((graphe.arc.get(k).s2.title.equals(Tab[i][0])) && (graphe.arc.get(k).s1.title.equals(Tab[0][j])))) {
                            Tab[i][j] = String.valueOf(graphe.arc.get(k).poid);
                            stop = true;
                        } else if (i == j) Tab[i][j] = "0";
                        else Tab[i][j] = "99";
                        k++;
                    }

                }



        }
        System.out.println("MATRICE DE PONDERATION ");
        for (i=0;i<Tab.length;i++)
        {
            for (j=0;j<Tab.length;j++)
            {

                if (j==graphe.Nbr_Sommet) System.out.println(Tab[i][j]+"\n");
                else System.out.print(Tab[i][j]+"\t");
            }

        }
        this.MAtrice=Tab;



    }

}
