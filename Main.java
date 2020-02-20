package com.company;

import javafx.scene.shape.Arc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int nb;
        String s;
        boolean stop = false;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Ce Tp est Fait par Guendouzi Badra Souhila Et wided ");
        System.out.println("ENTRER LE NUMERO DU TP ");
        nb=sc.nextInt();
        switch(nb) {
            case 1: {

                System.out.println("VOUS ETES DANS LE TP 1 ");
                System.out.println("ENTRER LE NUMERO DE L'EXERCICE");
                nb = sc.nextInt();
                switch (nb) {
                    case 1: {
                        Graphe graphe = new Graphe();
                        while (stop == false) {
                            System.out.print("Donner Le Type Du graphe : Oriente ou Non_Oriente : \t");
                            s = sc.next();
                            if ((s.equals("Oriente")) || (s.equals("Non_Oriente"))) {
                                stop = true;
                                graphe.Type = s;
                            }
                        }

                        System.out.print("Donner le Nombre d'arcs pour votre Graphe \t");
                        nb = sc.nextInt();


                        for (int i = 0; i < nb; i++) {
                            System.out.println("la construction du " + (i + 1) + "eme arc");
                            System.out.print("Entrer Le Nom Du Premier Sommet\t");
                            s = sc.next();
                            Sommet m = new Sommet(s);
                            System.out.print("Entrer Le Nom Du Deuxieme Sommet\t");
                            s = sc.next();
                            Sommet m1 = new Sommet(s);
                            Arcs a = new Arcs(m, m1);
                            Arcs b = new Arcs(m1, m);
                            if (graphe.Type.equals("Oriente")) {
                                if (graphe.arc.contains(a)) {
                                    System.out.println(" **********  insertion Impossile car l'arc existe deja veuillez repeter **********  ");
                                    i--;
                                } else {
                                    System.out.println();
                                    graphe.arc.add(a);
                                    graphe.Nbr_Arc++;
                                    if (!(graphe.sm.contains(m))) {
                                        graphe.sm.add(m);
                                        graphe.Nbr_Sommet++;
                                    }
                                    if (!(graphe.sm.contains(m1))) {
                                        graphe.sm.add(m1);
                                        graphe.Nbr_Sommet++;
                                    }


                                }

                            } else {
                                if (graphe.arc.contains(a) || (graphe.arc.contains(b))) {
                                    System.out.println(" **********  insertion Impossile car l'arc existe deja veuillez repeter **********  ");
                                    i--;
                                } else {
                                    System.out.println();
                                    graphe.arc.add(a);
                                    graphe.Nbr_Arc++;
                                    if (!(graphe.sm.contains(m))) {
                                        graphe.sm.add(m);
                                        graphe.Nbr_Sommet++;
                                    }
                                    if (!(graphe.sm.contains(m1))) {
                                        graphe.sm.add(m1);
                                        graphe.Nbr_Sommet++;
                                    }


                                }
                            }
                        }
                        System.out.println(graphe.Nbr_Sommet);
                        System.out.println(graphe.Nbr_Arc);

                        Matrice_Adjacence m = new Matrice_Adjacence();
                        m.AffiChage(graphe);
                        break;
                    }
                    case 2: {
                        Graphe graphe = new Graphe();
                        while (stop == false) {
                            System.out.print("Donner Le Type Du graphe : Oriente ou Non_Oriente : \t");
                            s = sc.next();
                            if ((s.equals("Oriente")) || (s.equals("Non_Oriente"))) {
                                stop = true;
                                graphe.Type = s;
                            }
                        }

                        System.out.print("Donner le Nombre d'arcs pour votre Graphe \t");
                        nb = sc.nextInt();
                        String s1;
                        for (int i = 0; i < nb; i++) {
                            System.out.println("la construction du " + (i + 1) + "eme arc");
                            System.out.println("ENTRER LE NOM DE L'ARC");
                            s1 = sc.next();
                            System.out.print("Entrer Le Nom Du Premier Sommet\t");
                            s = sc.next();
                            Sommet m = new Sommet(s);
                            System.out.print("Entrer Le Nom Du Deuxieme Sommet\t");
                            s = sc.next();
                            Sommet m1 = new Sommet(s);
                            Arcs a = new Arcs(s1, m, m1);
                            Arcs b = new Arcs(m1, m);
                            if (graphe.Type.equals("Oriente")) {
                                if (graphe.arc.contains(a)) {
                                    System.out.println(" **********  insertion Impossile car l'arc existe deja veuillez repeter **********  ");
                                    i--;
                                } else {
                                    System.out.println();
                                    graphe.arc.add(a);
                                    graphe.Nbr_Arc++;
                                    if (!(graphe.sm.contains(m))) {
                                        graphe.sm.add(m);
                                        graphe.Nbr_Sommet++;
                                    }
                                    if (!(graphe.sm.contains(m1))) {
                                        graphe.sm.add(m1);
                                        graphe.Nbr_Sommet++;
                                    }


                                }

                            } else {
                                if (graphe.arc.contains(a) || (graphe.arc.contains(b))) {
                                    System.out.println(" **********  insertion Impossile car l'arc existe deja veuillez repeter **********  ");
                                    i--;
                                } else {
                                    System.out.println();
                                    graphe.arc.add(a);
                                    graphe.Nbr_Arc++;
                                    if (!(graphe.sm.contains(m))) {
                                        graphe.sm.add(m);
                                        graphe.Nbr_Sommet++;
                                    }
                                    if (!(graphe.sm.contains(m1))) {
                                        graphe.sm.add(m1);
                                        graphe.Nbr_Sommet++;
                                    }

                                }
                            }

                        }
                        Matrice_Incidence Mi = new Matrice_Incidence();
                        Mi.Afficher_Incidence(graphe);
                        break;
                    }
                    case 3: {
                        Graphe graphe = new Graphe();
                        while (stop == false) {
                            System.out.print("Donner Le Type Du graphe : Oriente ou Non_Oriente : \t");
                            s = sc.next();
                            if ((s.equals("Oriente")) || (s.equals("Non_Oriente"))) {
                                stop = true;
                                graphe.Type = s;
                            }
                        }

                        System.out.print("Donner le Nombre d'arcs pour votre Graphe \t");
                        nb = sc.nextInt();


                        for (int i = 0; i < nb; i++) {
                            System.out.println("la construction du " + (i + 1) + "eme arc");
                           // System.out.println("Entrer le Nom de l'arc");

                            System.out.print("Entrer Le Nom Du Premier Sommet\t");
                            s = sc.next();
                            Sommet m = new Sommet(s);
                            System.out.print("Entrer Le Nom Du Deuxieme Sommet\t");
                            s = sc.next();
                            Sommet m1 = new Sommet(s);
                            Arcs a = new Arcs(m, m1);
                            Arcs b = new Arcs(m1, m);
                            if (graphe.Type.equals("Oriente")) {
                                if (graphe.arc.contains(a)) {
                                    System.out.println(" **********  insertion Impossile car l'arc existe deja veuillez repeter **********  ");
                                    i--;
                                } else {
                                    System.out.println();
                                    graphe.arc.add(a);
                                    graphe.Nbr_Arc++;
                                    if (!(graphe.sm.contains(m))) {
                                        graphe.sm.add(m);
                                        graphe.Nbr_Sommet++;
                                    }
                                    if (!(graphe.sm.contains(m1))) {
                                        graphe.sm.add(m1);
                                        graphe.Nbr_Sommet++;
                                    }


                                }

                            } else {
                                if (graphe.arc.contains(a) || (graphe.arc.contains(b))) {
                                    System.out.println(" **********  insertion Impossile car l'arc existe deja veuillez repeter **********  ");
                                    i--;
                                } else {
                                    System.out.println();
                                    graphe.arc.add(a);
                                    graphe.Nbr_Arc++;
                                    if (!(graphe.sm.contains(m))) {
                                        graphe.sm.add(m);
                                        graphe.Nbr_Sommet++;
                                    }
                                    if (!(graphe.sm.contains(m1))) {
                                        graphe.sm.add(m1);
                                        graphe.Nbr_Sommet++;
                                    }


                                }
                            }

                        }
                        List_Adjacence list = new List_Adjacence();
                        list.Afficher_list(graphe);
                        break;

                    }


                }
                break;
            }
            case 2: {
                System.out.println("VOUS ETES DANS LE TP 2 ");
                System.out.println("ENTRER LE NUMERO DE L'EXERCICE");
                nb = sc.nextInt();
                switch (nb)
                {
                    case 1: {
                        int poid;
                        Graphe graphe = new Graphe();
                        while (stop == false) {
                            System.out.print("Donner Le Type Du graphe : Oriente ou Non_Oriente : \t");
                            s = sc.next();
                            if ((s.equals("Oriente")) || (s.equals("Non_Oriente"))) {
                                stop = true;
                                graphe.Type = s;
                            }
                        }

                        System.out.print("Donner le Nombre d'arcs pour votre Graphe \t");
                        nb = sc.nextInt();


                        for (int i = 0; i < nb; i++) {
                            System.out.println("la construction du " + (i + 1) + "eme arc");
                            System.out.println("Entrer Le Poid De votre Arc");
                            poid = sc.nextInt();
                            System.out.print("Entrer Le Nom Du Premier Sommet\t");
                            s = sc.next();
                            Sommet m = new Sommet(s);
                            System.out.print("Entrer Le Nom Du Deuxieme Sommet\t");
                            s = sc.next();
                            Sommet m1 = new Sommet(s);
                            Arcs a = new Arcs(poid, m, m1);
                            Arcs b = new Arcs(poid,m1, m);
                            if (graphe.Type.equals("Oriente")) {
                                if (graphe.arc.contains(a)) {
                                    System.out.println(" **********  insertion Impossile car l'arc existe deja veuillez repeter **********  ");
                                    i--;
                                } else {
                                    System.out.println();
                                    graphe.arc.add(a);
                                    graphe.Nbr_Arc++;
                                    if (!(graphe.sm.contains(m))) {
                                        graphe.sm.add(m);
                                        graphe.Nbr_Sommet++;
                                    }
                                    if (!(graphe.sm.contains(m1))) {
                                        graphe.sm.add(m1);
                                        graphe.Nbr_Sommet++;
                                    }


                                }

                            } else {
                                if (graphe.arc.contains(a) || (graphe.arc.contains(b))) {
                                    System.out.println(" **********  insertion Impossile car l'arc existe deja veuillez repeter **********  ");
                                    i--;
                                } else {
                                    System.out.println();
                                    graphe.arc.add(a);
                                    graphe.Nbr_Arc++;
                                    if (!(graphe.sm.contains(m))) {
                                        graphe.sm.add(m);
                                        graphe.Nbr_Sommet++;
                                    }
                                    if (!(graphe.sm.contains(m1))) {
                                        graphe.sm.add(m1);
                                        graphe.Nbr_Sommet++;
                                    }


                                }
                            }
                        }
                        Matrice_Ponderation Mp = new Matrice_Ponderation();
                        Mp.AffiChage_Ponderation(graphe);
                        break;
                    }
                    case 2 : {
                        int poid;
                        Graphe graphe = new Graphe();
                        while (stop == false) {
                            System.out.print("Donner Le Type Du graphe : Oriente ou Non_Oriente : \t");
                            s = sc.next();
                            if ((s.equals("Oriente")) || (s.equals("Non_Oriente"))) {
                                stop = true;
                                graphe.Type = s;
                            }
                        }

                        System.out.print("Donner le Nombre d'arcs pour votre Graphe \t");
                        nb = sc.nextInt();


                        for (int i = 0; i < nb; i++) {
                            System.out.println("la construction du " + (i + 1) + "eme arc");
                            System.out.println("Entrer Le Poid De votre Arc");
                            poid = sc.nextInt();
                            System.out.print("Entrer Le Nom Du Premier Sommet\t");
                            s = sc.next();
                            Sommet m = new Sommet(s);
                            System.out.print("Entrer Le Nom Du Deuxieme Sommet\t");
                            s = sc.next();
                            Sommet m1 = new Sommet(s);
                            Arcs a = new Arcs(poid, m, m1);
                            Arcs b = new Arcs(poid,m1, m);
                            if (graphe.Type.equals("Oriente")) {
                                if (graphe.arc.contains(a)) {
                                    System.out.println(" **********  insertion Impossile car l'arc existe deja veuillez repeter **********  ");
                                    i--;
                                } else {
                                    System.out.println();
                                    graphe.arc.add(a);
                                    graphe.Nbr_Arc++;
                                    if (!(graphe.sm.contains(m))) {
                                        graphe.sm.add(m);
                                        graphe.Nbr_Sommet++;
                                    }
                                    if (!(graphe.sm.contains(m1))) {
                                        graphe.sm.add(m1);
                                        graphe.Nbr_Sommet++;
                                    }


                                }

                            } else {
                                if (graphe.arc.contains(a) || (graphe.arc.contains(b))) {
                                    System.out.println(" **********  insertion Impossile car l'arc existe deja veuillez repeter **********  ");
                                    i--;
                                } else {
                                    System.out.println();
                                    graphe.arc.add(a);
                                    graphe.Nbr_Arc++;
                                    if (!(graphe.sm.contains(m))) {
                                        graphe.sm.add(m);
                                        graphe.Nbr_Sommet++;
                                    }
                                    if (!(graphe.sm.contains(m1))) {
                                        graphe.sm.add(m1);
                                        graphe.Nbr_Sommet++;
                                    }


                                }
                            }
                        }
                        Kruskal Kr = new Kruskal();
                        Kr.Algo_Kruskal(graphe);
                        break;
                    }
                        case 3:{
                            int poid;
                            Graphe graphe = new Graphe();
                            while (stop == false) {
                                System.out.print("Donner Le Type Du graphe : Oriente ou Non_Oriente : \t");
                                s = sc.next();
                                if ((s.equals("Oriente")) || (s.equals("Non_Oriente"))) {
                                    stop = true;
                                    graphe.Type = s;
                                }
                            }

                            System.out.print("Donner le Nombre d'arcs pour votre Graphe \t");
                            nb = sc.nextInt();


                            for (int i = 0; i < nb; i++) {
                                System.out.println("la construction du " + (i + 1) + "eme arc");
                                System.out.println("Entrer Le Poid De votre Arc");
                                poid = sc.nextInt();
                                System.out.print("Entrer Le Nom Du Premier Sommet\t");
                                s = sc.next();
                                Sommet m = new Sommet(s);
                                System.out.print("Entrer Le Nom Du Deuxieme Sommet\t");
                                s = sc.next();
                                Sommet m1 = new Sommet(s);
                                Arcs a = new Arcs(poid, m, m1);
                                Arcs b = new Arcs(poid,m1, m);
                                if (graphe.Type.equals("Oriente")) {
                                    if (graphe.arc.contains(a)) {
                                        System.out.println(" **********  insertion Impossile car l'arc existe deja veuillez repeter **********  ");
                                        i--;
                                    } else {
                                        System.out.println();
                                        graphe.arc.add(a);
                                        graphe.Nbr_Arc++;
                                        if (!(graphe.sm.contains(m))) {
                                            graphe.sm.add(m);
                                            graphe.Nbr_Sommet++;
                                        }
                                        if (!(graphe.sm.contains(m1))) {
                                            graphe.sm.add(m1);
                                            graphe.Nbr_Sommet++;
                                        }


                                    }

                                } else {
                                    if (graphe.arc.contains(a) || (graphe.arc.contains(b))) {
                                        System.out.println(" **********  insertion Impossile car l'arc existe deja veuillez repeter **********  ");
                                        i--;
                                    } else {
                                        System.out.println();
                                        graphe.arc.add(a);
                                        graphe.Nbr_Arc++;
                                        if (!(graphe.sm.contains(m))) {
                                            graphe.sm.add(m);
                                            graphe.Nbr_Sommet++;
                                        }
                                        if (!(graphe.sm.contains(m1))) {
                                            graphe.sm.add(m1);
                                            graphe.Nbr_Sommet++;
                                        }


                                    }
                                }
                            }
                            Prim p=new Prim();
                            p.Prim_Afficher(graphe);
                                 break;
                        }
                    case 4:
                    {  Graphe graphe=new Graphe();
                        System.out.println("donner le type");
                        String type=sc.next();
                        graphe.Type=type;
                        System.out.print("Donner le Nombre d'arcs pour votre Graphe \t");
                        nb = sc.nextInt();
                        for (int i = 0; i < nb; i++) {
                            System.out.println("la construction du " + (i + 1) + "ème arc");
                            System.out.print("Entrer Le Nom Du Premier Sommet\t");
                            s = sc.next();
                            Sommet m = new Sommet(s);
                            System.out.print("Entrer Le Nom Du Deuxieme Sommet\t");
                            s = sc.next();
                            Sommet m1 = new Sommet(s);
                            Arcs a = new Arcs(m, m1);
                            Arcs  b= new Arcs(m1,m);
                            if (graphe.Type.equals("Oriente")) {
                                if (graphe.arc.contains(a)) {
                                    System.out.println(" **********  insertion Impossile car l'arc existe deja veuillez repeter **********  ");
                                    i--;
                                } else {
                                    System.out.println();
                                    graphe.arc.add(a);
                                    graphe.Nbr_Arc++;
                                    if (!(graphe.sm.contains(m))) {
                                        graphe.sm.add(m);
                                        graphe.Nbr_Sommet++;
                                    } else {
                                        for (Sommet s2 : graphe.sm) {
                                            if (s2.equals(m)) s2.degree++;
                                        }
                                    }
                                    if (!(graphe.sm.contains(m1))) {
                                        graphe.sm.add(m1);
                                        graphe.Nbr_Sommet++;
                                    } else {
                                        for (Sommet s1 : graphe.sm) {
                                            if (s1.equals(m1)) s1.degree++;
                                        }
                                    }
                                }
                            }
                            else {
                                if (graphe.arc.contains(a)||(graphe.arc.contains(b))) {
                                    System.out.println(" **********  insertion Impossile car l'arc existe deja veuillez repeter **********  ");
                                    i--;
                                } else {
                                    System.out.println();
                                    graphe.arc.add(a);
                                    graphe.Nbr_Arc++;
                                    if (!(graphe.sm.contains(m))) {
                                        graphe.sm.add(m);
                                        graphe.Nbr_Sommet++;
                                    } else {
                                        for (Sommet s2 : graphe.sm) {
                                            if (s2.equals(m)) s2.degree++;
                                        }
                                    }
                                    if (!(graphe.sm.contains(m1))) {
                                        graphe.sm.add(m1);
                                        graphe.Nbr_Sommet++;
                                    } else {
                                        for (Sommet s1 : graphe.sm) {
                                            if (s1.equals(m1)) s1.degree++;
                                        }
                                    }
                                }
                            }
                        }
                        WelshPowell Wp=new WelshPowell();
                        Wp.Colorer(graphe);
                        break;
                    }
                    default :
                        System.out.println("Il n'ya pas cet exercice :)");
                    }
                    break;
            }
            case 3 :
            { System.out.println("VOUS ETES DANS LE TP 3 ");
                System.out.println("ENTRER LE NUMERO DE L'EXERCICE");
                nb = sc.nextInt();
                switch (nb) {
                    case 1:{
                        int poid;
                        Graphe graphe = new Graphe();
                        while (stop == false) {
                            System.out.print("Donner Le Type Du graphe : Oriente ou Non_Oriente : \t");
                            s = sc.next();
                            if ((s.equals("Oriente")) || (s.equals("Non_Oriente"))) {
                                stop = true;
                                graphe.Type = s;
                            }
                        }

                        System.out.print("Donner le Nombre d'arcs pour votre Graphe \t");
                        nb = sc.nextInt();


                        for (int i = 0; i < nb; i++) {
                            System.out.println("la construction du " + (i + 1) + "eme arc");
                            System.out.println("Entrer Le Poid De votre Arc");
                            poid = sc.nextInt();
                            System.out.print("Entrer Le Nom Du Premier Sommet\t");
                            s = sc.next();
                            Sommet m = new Sommet(s);
                            System.out.print("Entrer Le Nom Du Deuxieme Sommet\t");
                            s = sc.next();
                            Sommet m1 = new Sommet(s);
                            Arcs a = new Arcs(poid, m, m1);
                            Arcs b = new Arcs(poid,m1, m);
                            if (graphe.Type.equals("Oriente")) {
                                if (graphe.arc.contains(a)) {
                                    System.out.println(" **********  insertion Impossile car l'arc existe deja veuillez repeter **********  ");
                                    i--;
                                } else {
                                    System.out.println();
                                    graphe.arc.add(a);
                                    graphe.Nbr_Arc++;
                                    if (!(graphe.sm.contains(m))) {
                                        graphe.sm.add(m);
                                        graphe.Nbr_Sommet++;
                                    }
                                    if (!(graphe.sm.contains(m1))) {
                                        graphe.sm.add(m1);
                                        graphe.Nbr_Sommet++;
                                    }


                                }

                            } else {
                                if (graphe.arc.contains(a) || (graphe.arc.contains(b))) {
                                    System.out.println(" **********  insertion Impossile car l'arc existe deja veuillez repeter **********  ");
                                    i--;
                                } else {
                                    System.out.println();
                                    graphe.arc.add(a);
                                    graphe.Nbr_Arc++;
                                    if (!(graphe.sm.contains(m))) {
                                        graphe.sm.add(m);
                                        graphe.Nbr_Sommet++;
                                    }
                                    if (!(graphe.sm.contains(m1))) {
                                        graphe.sm.add(m1);
                                        graphe.Nbr_Sommet++;
                                    }


                                }
                            }
                        }
                    }

                }

            }
            default:
                System.out.println("Ce Tp n'existe Pas :)");
        }


    }
}


