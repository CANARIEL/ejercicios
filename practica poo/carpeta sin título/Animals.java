class Animals{
    Integer age;
    String raza;
    String name;
    String color;
    Double stature;

    public Animals(Integer age, String raza, String name, String color, Double stature ){

            this.raza = raza;
            this.name = name;
            this.color = color;
            this.stature = stature;
            this.age = age;

    }

         public  void  printAnimals() {
                System.out.println("age " +age+   "raza" +raza+   "name "  +name+    "stature"  +stature+  "color" +color); 
           
        }

}