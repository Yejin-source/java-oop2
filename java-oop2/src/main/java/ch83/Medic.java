package ch83;

public class Medic extends Unit implements ICure {
    public Medic(){
        this.name="메딕";
    }
    public void cure(Unit unit){
    	if(unit instanceof ICure) { // Tank 타입은 false
    		unit.hp++;
    		System.out.println(unit.name+"을 치료하다");    		
    	}
    }
    
    /*
	    public void cure(ICure unit){
	    	if(unit instanceof ICure) {
	    		unit.hp++; // 강제형변환 필요 | 호출 불가능
	    		System.out.println(unit.name+"을 치료하다"); // 호출 불가능   		
	    	}
	    }
    */
}
