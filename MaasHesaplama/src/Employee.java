public class Employee {
    String name ;
    int salary;
    int workHours;
    int hireYear;

      Employee(String name , int salary , int workHours , int hireYear){
          this.name =name;
          this.salary = salary;
          this.workHours = workHours;
          this.hireYear = hireYear;
    }

    public double tax(){
          if (salary<1000){
              return 0;
          }else {
              return salary * 0.03;
          }
    }
    public double bonus(){
          double bonus =0;
          if (workHours>40){
               bonus = (workHours-40) * 30;
          }
        return bonus;
    }
    public double raiseSalary(){
          int year =2021;
          int y = year - hireYear;
          if (hireYear<10){
              return (int) (salary * 0.05);
          }else if (hireYear >9 && hireYear<20){
              return (int) (salary * 0.1);
          }else if (hireYear>19){
              return (int) (salary * 0.15);
          }

        return year;
    }
    public double Total(){
        double total;
        return total= bonus()-tax() + salary;
    }
    public double TotalSalary(){
          double total2;
          return total2 = bonus()-tax() + salary +raiseSalary();
    }

    public String toString(){
          return  "Name : "+ name + "\n"+
                  "Maaşı :" +salary +"\n"+
                  "Çalışma Saati :" + workHours + "\n"+
                  "Başlangıç Yılı :" + hireYear +"\n" +
                  "Vergi :"+tax() + "\n" +
                    "Bonus :" + bonus() + "\n" +
                  "Maaş Zammı :" +raiseSalary()+ "\n" +
                  "Vergi ve Bonuslar ile  Toplam :"+Total() + "\n" +
                  "Toplam Zamlı Maaş :" +TotalSalary();

    }
}
