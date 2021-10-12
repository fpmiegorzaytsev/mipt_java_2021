public class Display {
    private String diagonal;
    private String matrixType;

    public Display(String diagonal, String matrixType){
        this.setDiagonal(diagonal);
        this.setMatrixType(matrixType);
    }

    public String getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(String diagonal) {
        this.diagonal = diagonal;
    }

    public String getMatrixType() {
        return matrixType;
    }

    public void setMatrixType(String matrixType) {
        this.matrixType = matrixType;
    }
    @Override
    public String toString(){
        return("Display parameters : " + getDiagonal() + ", " + getMatrixType());
    }
}
