package design.decorate;

import design.decorate.decrators.*;

public class Demo {
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecrator(
                        new FileDataSource("/Volumes/WD_BLACK/Coding/Project/JAVA/Design/Design/src/main/java/design/decorate/out/OutputDemo.txt")));
//        FileDataSource file = new FileDataSource("/Volumes/WD_BLACK/Coding/Project/JAVA/Design/Design/src/main/java/design/decorate/out/OutputDemo.txt");

//        file.writeData(salaryRecords);
        encoded.writeData(salaryRecords);

        DataSource plain = new FileDataSource("/Volumes/WD_BLACK/Coding/Project/JAVA/Design/Design/src/main/java/design/decorate/out/OutputDemo.txt");

        System.out.println("input");
        System.out.println(salaryRecords);
        System.out.println("encoded");
        System.out.println(plain.readData());
        System.out.println("decoded");
        System.out.println(encoded.readData());
    }
}
