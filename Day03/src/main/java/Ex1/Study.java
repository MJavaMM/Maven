package Ex1;

public class Study {
    private Unit Unit;

    public Study() {
    }

    public Study(Unit unit) {
        Unit = unit;
    }

    public Unit getUnit() {
        return Unit;
    }

    public void show(Unit unit) {
      if(Unit.U1==unit){
          System.out.println("第一单元打基础");
      }else if(Unit.U2==unit){
          System.out.println("第二单元可以担任Java程序开发");
      }else if(Unit.U3==unit){
          System.out.println("第三单元可以胜任企业级Java开发");
      }
    }

    public void setUnit(Unit unit) {
        Unit = unit;
    }
}
