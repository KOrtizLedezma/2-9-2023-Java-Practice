class A{
  int i;
  A(int i){ //Constructor to pass i's value
    this.i = i;
  }
  A(){  //To make a generic A with i as 100
    this.i = 100;
  }
  public void setI(int i){  //We can change the i after the constructor
    this.i = i;
  }
  public String toString(){  //To display info
    return "A i= " + i;
  }
}

class Main {
  public static void main(String[] args) {
    A a = new A();
    System.out.println(a);
    A b = a;
    System.out.println(b);
    b.setI(50);
    System.out.println(a);
  }
}