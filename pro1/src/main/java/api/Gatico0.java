package api;

class GaticoO{
/**
 * @return primero  este  no es muy privado que digamos dejabamos un constructor  con los datos publicos
 *///
 // GaticoO  ha =  new GaticoO(null, null, 0);

// String datoK = ha.datos();
private String  datos(){


    String   Od = "live_biz4jpA4mj5TUPycR5nSPE9xh7qwM9s0y2YRqO49zXz84SfditgskJVoWq8ZZRGF'";

       return Od;
}






private String url;
private String  key;
private int id;



private GaticoO(String url, String key, int id){

     this.key = key;
     this.id = id;
     this.url = url;
     
    

}
/*
 * 
 */


private void GaticoO0(String url , int id){

    GaticoO   instance = new GaticoO(url, null, id);
    instance.key = instance.datos();

}



public String getUrl() {
    return url;
}



public void setUrl(String url) {
    this.url = url;
}



private String getKey() {
    return key;
}

private void setKey(String key) {
    this.key = key;
}

public int getId() {
    return id;
}



public void setId(int id) {
    this.id = id;
}











}












// }