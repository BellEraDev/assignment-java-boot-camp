package com.example.Shopping.products;

public class OriginalAddress{
	private String subDistrictCode;
	private String districtCode;
	private String provinceCode;
	private String postalCode;
	private String label;

	public void setSubDistrictCode(String subDistrictCode){
		this.subDistrictCode = subDistrictCode;
	}

	public String getSubDistrictCode(){
		return subDistrictCode;
	}

	public void setDistrictCode(String districtCode){
		this.districtCode = districtCode;
	}

	public String getDistrictCode(){
		return districtCode;
	}

	public void setProvinceCode(String provinceCode){
		this.provinceCode = provinceCode;
	}

	public String getProvinceCode(){
		return provinceCode;
	}

	public void setPostalCode(String postalCode){
		this.postalCode = postalCode;
	}

	public String getPostalCode(){
		return postalCode;
	}

	public void setLabel(String label){
		this.label = label;
	}

	public String getLabel(){
		return label;
	}
}
