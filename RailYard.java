import java.util.LinkedList;
import java.util.Collections;

/** RailYard class. extends comparable because methods within class and nested class use comparable function */
public class RailYard<T extends Comparable<T>> {
  private DoubleLinkedList<T> classYard;
  private static String algorithmSpec;
  public static T[]<ClassificationYard<T>> trackHolder;
  public static String[] trackQuants;
  public static T[] trainCarArray;
  public static int classYardQuant;
 
  
  /**
   * main method for RailYard class. Takes our argument and sorts out the inputs into respective variables or arrays. */
  public static void main (String[] args){
    RailYard myRailYard = new RailYard<>();
    classYardSize = new int[classYardQuant];
    String algorithmSpec = args[0];
    int classYardQuant = Integer.parseInt(args[1]);
    trainCarArray = new T[args.length - classYardQuant - 2];
    String[] trackQuants;
    for(int i = 2; i < classYardQuant; i ++){
      trainCarArray.add(args[i]);
    }
    /**
     * loop to create our trainCarArray. runs through necessary args and adds them to trainCarArray */
     for(int index = classYardQuant + 2; index < args.length; index ++){ //runs through the args proceeding other arguments
        trainCarArray.add(args[index]);
     }
  }
  
  /**
   * nested Classification yard class that is associated with however many sorting yards is inputed in the main method. */
   public static class ClassificationYard<T>{
     private T[]<DoubleLinkedList<T>> trackQuant ;
     
     public ClassificationYard(int trackQuant){
     for(int index = 0; index < classYardQuant; index ++){
         trackHolder = new T[]<DoubleLinkedList<T>>(trackQuant);
         trackHoler.add(new DoubleLinkedList<T>());
      }
    }
  }
  
  
  /**
   * method for our cycleSort algorithm. Uses inputs from our args input in main class to sort through the trainCarArray train.*/
  public void cycleSort(String[] trainCarArray) {
    classYard[0].setBack(trainCarArray[0]);
    int arrayPointer = 0; //needs to get updated every time we move to a new LL in the array of LLs
    DLNode<T> nodePointer = classYard[arrayPointer].getElement().getBack();
    
    for (int index = 1; index < trainCarArray.length; index ++){
     if (trainCarArray[index].compareTo(trainCarArray[index - 1]) >= 0){
      classYard[arrayPointer].getElement().addToBack(new DLNode<>(index));  
      nodePointer = classYard[arrayPointer].getElement();
     }
     else if (trainCarArray[index].compareTo(trainCarArray[index - 1] < 0)){
       arrayPointer += 1;
       if (classYard[arrayPointer].getElement().getBack() != null){
         classYard[arrayPointer].getElement().addToBack(new DLNode<>(index));
         nodePointer = classYard[arrayPointer].getElement();
       }
       else if (trainCarArray[index].compareTo(trainCarArray[index - 1]) < 0 && arrayPointer == classYard.length){
         arrayPointer = 0;
         classYard[arrayPointer].getElement().addToBack(new Node<>(index));
       }
    }
  }
}
  
  /**
   * method for closest sort algorithm. */
  public void closestSort(String[] trainCarArray){
    for(int carIndex = 0; carIndex < trainCarArray.length; carIndex ++){
      for(int trackIndex = 0; trackIndex < trackQuant; trackIndex ++){
        if(trackHoler[trackIndex].getElement().getBack().compareTo(trainCarArray[index]) > 0){
          for(int trackIndex2 = 0; trackIndex2 < trackQuant; trackIndex2 ++){
            if(trackHoler[trackIndex2].getElement().getBack().isEmpty()){
              trackHoler[trackIndex2].setBack(carIndex);
            }
            else if(trackHoler[trackIndex2].getElement().getBack() != null){
              null;
            }
            else if(trackHoler[trackIndex2].getElement().getBack() != null && trackIndex2 == trackQuant){
              T currentLeastValue;
              for(int trackIndex3 = 1; trackIndex3 < trackQuant; trackIndex3 ++){
                if(trackHoler[trackIndex3].getElement.getBack().compareTo(trackHoler[trackIndex3].getElement().getNext()) < 0);
              }
            }
          }
        }
           trackHoler[trackIndex].setBack(carIndex);
      }
    }
  }
}