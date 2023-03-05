
package Question5;
class SingletonObject {

    private static SingletonObject instance = new SingletonObject();

    private SingletonObject(){}

    public static SingletonObject getInstance(){
        return instance;
    }

    public void printMessage(){
        System.out.println("Singleton object!");
    }
}

      class Singleton {
          public static void main(String[] args) {

              SingletonObject object = SingletonObject.getInstance();
              object.printMessage();
          }
      }
