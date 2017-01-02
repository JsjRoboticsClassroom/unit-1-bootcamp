

public class ClassesAndObjects {

  public static void main (String args[]) {

    //answer 1 : Cool Cat

    Cat garfield = new Cat("Garfield");
    Cat pinkPanther =new Cat("Pink Panther");
    Cat catWoman = new Cat ("Catwoman");

    garfield.setFavoriteFood("Lasagna");
    pinkPanther.setFavoriteFood("Steak");
    catWoman.setFavoriteFood("Sushi");

    garfield.setFavoriteFood("3");
    pinkPanther.setFavoriteFood("5");
    catWoman.setFavoriteFood("9");

    System.out.println(kitten(garfield,catWoman)); // GarfieldCatWoman

    Person owner = new Person ("Mel");
    adoption(catWoman, owner);
    adoption(garfield, owner);
    adoption(pinkPanther, owner);

    System.out.println(isFree(catWoman)); //Catwoman will never be anyone's pet!
    System.out.println(isFree(garfield)); // true

    System.out.println(isSiblings(catWoman, garfield)); // false
    System.out.println(isSiblings(garfield, pinkPanther)); // true




  }

  // answer 2 : isOlder
  public static boolean isOlder(Cat a, Cat b) {
    if (a.getAge() > b.getAge()) {
      return true;
    } else {
      return false;
    }
  }

  // answer 3: Best Friends
  public static void bestFriends(Cat a, Cat b){
    a.setFavoriteFood(b.getFavoriteFood());
  }

  //answer 4: Kitten
  public static String kitten(Cat mom, Cat dad) {
    Cat kitten = new Cat(mom.getName() + dad.getName());
    kitten.setAge(0);
    return kitten.getName();
  }

  //answer 5 : Adoption & Bonus
  public static void adoption(Cat cat, Person owner) {
    if (cat.getName().equals("Catwoman")) {
      System.out.println("Catwoman will never be anyone's pet!");
    } else {
      cat.setOwner(owner);
    }

  }

  //answer 6: isFree
  public static boolean isFree ( Cat a){
    if(a.getOwner() !=null){
      return true;
    }
  return false;
  }

  //answer 7: isSiblings
  public static boolean isSiblings(Cat a, Cat b) {
    if (a.getOwner() == null || b.getOwner() == null) {
      return false;

    } else {
      if (a.getOwner() == b.getOwner()) {
        return true;

      } else {
        return false;
      }
    }
  }



}

