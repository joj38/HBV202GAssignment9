package is.hi.hbv202g.ass9.compositeLeafObservedByComposite;

public class NumberLeaf implements MathExpressions {
    private int value;

    public NumberLeaf(int value){
        this.value=value;
    }

    public int getResult(){
        return value;
    }
}
