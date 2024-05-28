public class No {
    private Pessoa info;
    private No proximo;

    public No (Pessoa info){

        setInfo(info);
        proximo = null;
    }

    // getters
    public Pessoa getInfo(){
        return info;
    }
    public No getProximo(){
        return proximo;
    }

    // setters
    public void setInfo(Pessoa info){
        this.info = info;
    }
    public void setProximo(No proximo){
        this.proximo = proximo;
    }

    @Override
    public String toString(){
        return "|" + info + "| -> " ;
    }
}
