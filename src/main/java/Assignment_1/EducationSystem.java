package Assignment_1;

public class EducationSystem {
    public static void main(String[]args) {
        Graduation gd = new Graduation();
        gd.streams();
        gd.hscPercentage();
        gd.ageCriteria();
        System.out.println("---------------gd--------------");

        Engineering eg = new Engineering();
        eg.streams();
        eg.typeOfEngineering();
        System.out.println("-------------eg--------------------");
        ComputerScienceEngg cse = new ComputerScienceEngg();
        cse.hscPercentage();

        cse.subjects();
        System.out.println("--------cse-----------");

    }


}
