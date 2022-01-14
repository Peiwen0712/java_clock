public class Number{
  private int value;
  private int limit;

  public Number(int limit){
    this.value = 0;
    this.limit = limit;
  }

  public Number(int value, int limit){
    this.value = value;
    this.limit = limit;
  }

  public int getValue(){
    return value;
  }

  public void advance(){
    value++;
    if(value >= limit){
      value = 0;
    }
  }

  public String toString(){
    if(value < 10){
      return "0"+ value;
    }
    else{
      return ""+value;
    }
  }
}
