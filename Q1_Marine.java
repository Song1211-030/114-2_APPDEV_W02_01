public class Q1_Marine {
  public static void main(String[] args) {
    // 完成輸出
    System.out.println("Hello, Ocean!");
  } 
}

public class Q2_Fish {
  // 1. 宣告兩個屬性
  String name; double weight;
  // 2. 撰寫 displayInfo 方法
  public void displayInfo() {
    System.out.println("這隻魚的名字是：" + name + "，重量是：" + weight + "公斤");
  }
public static void main(String[] args) {
  // 3. 實例化 Q2_Fish 物件
  Q2_Fish myFish = new Q2_Fish();
  // 4. 將 name 設為 "黑鮪魚"，weight 設為 250.5 myFish.name = "黑鮪魚";
  myFish.weight = 250.5;
  // 5. 呼叫 displayInfo() 方法 myFish.displayInfo();
 }
}

public class Q3_Turtle {
  String species; int age;
  // 1. 撰寫建構子 (Constructor)，接收 species 與 age 作為參數並初始化屬性
  public Q3_Turtle(String species, int age) {
    this.species = species; // 利用 this. 區分屬性與參數
    this.age = age;
  }
  public void showDetails() {
    System.out.println("品種：" + species + "，年紀：" + age + "歲");
  }
  public static void main(String[] args) {
    // 2. 利用建構子，直接在建立物件時傳入初始值
    Q3_Turtle myTurtle = new Q3_Turtle("綠蠵龜", 50);
// 呼叫方法印出資訊
    myTurtle.showDetails();
  }
}
