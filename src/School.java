
    public class School {
        private String name;
        private String lastname;
        private  int age;
        public String getName(){
            return  name;
        }
        public void setName(String name){
            this.name = name;
        }
        public  String getLastname(){
            return  lastname;
        }
        public void  setLastname(String lastname){
            this.name = name;
        }
        public int getAge(){
            return  age;
        }
        public  void setAge(int age){
            if (age<0){
                System.out.println("Введите положительное число:");
            }
            this.age = age;
        }
        public  void resschool(){
            System.out.println("Школьники:");
            System.out.println("name = " + name);
            System.out.println("lastname = " + lastname);
            System.out.println("age = " + age);
        }
    }

