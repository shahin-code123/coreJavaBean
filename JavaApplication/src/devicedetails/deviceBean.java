package devicedetails;

public class deviceBean {
	

    private int deviceId;
    private String deviceName;
    private String deviceOS;
    private String kernalVersion;
    private String Manf_date;
    private String RAM_Detail;
    private long IMEI_Code;
    private String password;
    private String confirmpassword;
    public void setdeviceId(int id)
    {
	    this.deviceId=id;
    }
    public int getdeviceId()
    {
	    return deviceId;
    }
    public void setdeviceName(String name)
    {
    	this.deviceName=name;
    }
    public String getdeviceName()
    {
    	return deviceName;
    }
    public void setdeviceOS(String deviceOS)
    {
    	this.deviceOS=deviceOS;
    }
    public String getdeviceOS()
    {
    	return deviceOS;
    }
    public void setkernalVersion(String kernal_version)
    {
    	this.kernalVersion=kernal_version;
    }
    public String getkernalVersion()
    {
    	return kernalVersion;
    }
    public void setManf_date(String Date)
    {
    	this.Manf_date=Date;
    }
    public String getManf_Date()
    {
    	return Manf_date;
    }
    public void setRAM_Detail(String Ram)
    {
    	this.RAM_Detail=Ram;
    }
    public String getRAM_Detail()
    {
    	return RAM_Detail;
    }
    public void setIMEI_Code(long code)
    {
    	this.IMEI_Code=code;
    }
    public long getIMEI_Code()
    {
    	return IMEI_Code;
    }
    public void setpassword(String password)
    {
    	this.password=password;
    }
    public String getpassword()
    {
    	return password;
    }
    public void setconfirmpassword(String confirm)
    {
    	this.confirmpassword=confirm;
    }
    public String getconfirmpassword()
    {
    	return confirmpassword;
    }
   
}
