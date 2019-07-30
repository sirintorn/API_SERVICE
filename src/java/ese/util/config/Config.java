package ese.util.config;

public class Config {
    public String GetApplicationDirectory() {
        String localDirName;

        //Use that name to get a URL to the directory we are executing in
        //Open a URL to the our .class file
        java.net.URL myURL = this.getClass().getResource(this.GetClassName());

        //Clean up the URL and make a String with absolute path name
        localDirName = myURL.getPath();  //Strip path to URL object out
        localDirName = localDirName.replaceAll("%20", " ");  //change %20 chars to spaces

        //Get the current execution directory
        localDirName = localDirName.substring(0, localDirName.lastIndexOf("/")); //clean off the file name
        localDirName = localDirName.substring(0, localDirName.lastIndexOf("/"));
        localDirName = localDirName.substring(0, localDirName.lastIndexOf("/"));
        localDirName = localDirName.substring(0, localDirName.lastIndexOf("/"));

        return localDirName;
    }

    public String GetClassName() {
        String className;

        //Build a string with executing class's name
        className = this.getClass().getName();
        className = className.substring(className.lastIndexOf(".") + 1, className.length());
        className += ".class";  //this is the name of the bytecode file that is executing

        return className;
    }
}
