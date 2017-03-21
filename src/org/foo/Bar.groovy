package org.foo

public class Bar implements Serializable {
  String remotePath;
  String jobUrl; 
  String folderFullPath; 
  String shortName; 

  public Bar(String remotePathParam, String jobURLParam){
    this.remotePath = remotePathParam;
    this.jobUrl = jobURLParam;
    this.shortName = remotePathParam.substring(remotePathParam.lastIndexOf("/") + 1);
    String sSubSetPath = remotePathParam.replace("jenkins://", "")
    this.folderFullPath = sSubSetPath.substring(sSubSetPath.indexOf("/") + 1);
  }
}
