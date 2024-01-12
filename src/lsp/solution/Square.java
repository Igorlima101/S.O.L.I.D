package src.lsp.solution;

public class Square extends Rectangle implements Area {


    @Override
    public double valueArea() {
        return getHeight() * getWidth();
    }
}
