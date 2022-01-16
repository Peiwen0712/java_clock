public class Clock{
  private Number hours;
  private Number mins;

  public Clock(){
    hours = new Number(24);
    mins = new Number(60);
  }

  public Clock(int h, int m){
    hours = new Number(h,24);
    mins = new Number(m,60);
  }

  public void tick(){
    mins.advance();
    if(mins.getValue() == 0){
      hours.advance();
    }
  }

  public String toString(){
    return hours + ":" + mins;
  }
}
