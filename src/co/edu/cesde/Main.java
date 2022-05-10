package co.edu.cesde;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class Main {

    public static void main(String[] args) {
        Scanner inputData=new Scanner(System.in);


        List<Accountant>contadores=new ArrayList<>();
        List<Watchman>vigilantes =new ArrayList<>();
        List<CleaningStaff>aseadores=new ArrayList<>();
        List<Admin>administradores=new ArrayList<>();

        boolean cierre=false;
        while (!cierre){
        int menu;
        System.out.println("selecione la opcion que desee "+"\n ingrese 1:para ingresar datos"+"\n ingrese 2: para mostrar registros"+"\n ingrese 3: si desea salir");
        menu =Integer.parseInt(inputData.nextLine());

        switch (menu){

            case 1:
                int datos;
                System.out.println("Que dato desea ingresar"+"\n ingrese 1:vigilante"+"\n ingrese 2:limpieza"+"\n ingrese 3:contador"+"\n ingrese 4:administracion"+"\n ingrese 5:volver a menu");
                datos =Integer.parseInt(inputData.nextLine());
                switch (datos){

                    case 1:
                        Watchman vigilante = new Watchman();

                    System.out.println("ingrese el nombre del vigilante ");
                    vigilante.setName(inputData.nextLine());

                    System.out.println("ingrese la identificacion de "+vigilante.getName());
                    vigilante.setIdentification(inputData.nextLine());

                    System.out.println("ingrese la edad de "+vigilante.getName());
                    vigilante.setAge(Integer.parseInt( inputData.nextLine()));

                    System.out.println("ingrese el arma de "+vigilante.getName());
                    vigilante.setWeapon(inputData.nextLine());

                    System.out.println("ingrese el dia de trabajo de "+vigilante.getName());
                    vigilante.setWorkday( inputData.nextLine());

                    vigilantes.add(vigilante);
                    break;



                    case 2:
                    CleaningStaff aseador = new CleaningStaff();

                    System.out.println("ingrese el nombre del aseador ");
                    aseador.setName(inputData.nextLine());

                    System.out.println("ingrese la identificacion de "+aseador.getName());
                    aseador.setIdentification(inputData.nextLine());

                    System.out.println("ingrese la edad de "+aseador.getName());
                    aseador.setAge(Integer.parseInt( inputData.nextLine()));

                    System.out.println("ingrese el dia de descanso de  "+aseador.getName());
                    aseador.setDayOff(inputData.nextLine());

                    aseadores.add(aseador);
                    break;


                    case  3:
                    Accountant contador = new Accountant();

                    System.out.println("ingrese el nombre del contador ");
                    contador.setName(inputData.nextLine());

                    System.out.println("ingrese la identificacion de "+contador.getName());
                    contador.setIdentification(inputData.nextLine());

                    System.out.println("ingrese la edad de "+contador.getName());
                    contador.setAge(Integer.parseInt( inputData.nextLine()));

                    System.out.println("ingrese el lider de "+contador.getName());
                    contador.setLeader(inputData.nextLine());

                    System.out.println("ingrese el estacionamiento de "+contador.getName());
                    contador.setParking(inputData.nextLine());

                    contadores.add(contador);
                    break;


                    case 4:

                    Admin administrador = new Admin();

                    System.out.println("ingrese el nombre del administrador ");
                    administrador.setName(inputData.nextLine());

                    System.out.println("ingrese la identificacion de "+administrador.getName());
                    administrador.setIdentification(inputData.nextLine());

                    System.out.println("ingrese la edad de "+administrador.getName());
                    administrador.setAge(Integer.parseInt( inputData.nextLine()));

                    System.out.println("ingrese el lider de"+administrador.getName());
                    administrador.setLeader(inputData.nextLine());

                    System.out.println("ingrese el estacionamiento de"+administrador.getName());
                    administrador.setParking(inputData.nextLine());

                    administradores.add(administrador);

                    break;

                    case 5:break;


                    }
                    break;


            case 2:
                int registros;
                System.out.println("ingrese el regitro que desea ver"+"\n 1:vigilante"+"\n 2:aseador "+ " \n 3:contador"+"\n 4:administrador ");
                 registros= Integer.parseInt(inputData.nextLine());
                switch (registros){
                    case 1:
                        System.out.println("los vigilantes son");
                        for (int i=0;i<vigilantes.size();i++){

                            System.out.println(vigilantes.get(i).getName());
                        }
                        break;
                    case 2:
                        System.out.println("los aseadores son");
                        for (int i=0;i<aseadores.size();i++){

                            System.out.println(aseadores.get(i).getName());
                        }
                        break;
                    case 3:
                        System.out.println("los contadores son");
                        for (int i=0;i<contadores.size();i++){

                            System.out.println(contadores.get(i).getName());
                        }
                        break;
                    case 4:
                        System.out.println("los administradores son ");
                        for (int i=0;i<administradores.size();i++){

                            System.out.println( administradores.get(i).getName());
                        }
                        break;

                }
                break;
            case 3:

                cierre=true;
                break;



        }
        }

















    }
}
