package one.digitalinnovation.gof.model;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Geolocalizacao
{
    @Id
    private String geopluginRequest; // IP
    private Integer geopluginStatus;
    private String geopluginDelay;
    private String geopluginCredit;
    private String geopluginCity;
    private String geopluginRegion;
    private String geopluginRegionCode;
    private String geopluginRegionName;
    private String geopluginAreaCode;
    private String geopluginDmaCode;
    private String geopluginCountryCode;
    private String geopluginCountryName;
    private Integer geopluginInEU;
    private Boolean geopluginEuVATrate;
    private String geopluginContinentCode;
    private String geopluginContinentName;
    private String geopluginLatitude;
    private String geopluginLongitude;
    private String geopluginLocationAccuracyRadius;
    private String geopluginTimezone;
    private String geopluginCurrencyCode;
    private String geopluginCurrencySymbol;
    private String geopluginCurrencySymbolUTF8;
    private Double geopluginCurrencyConverter;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getGeopluginRequest() {
        return geopluginRequest;
    }

    public void setGeopluginRequest(String geopluginRequest) {
        this.geopluginRequest = geopluginRequest;
    }

    public Integer getGeopluginStatus() {
        return geopluginStatus;
    }

    public void setGeopluginStatus(Integer geopluginStatus) {
        this.geopluginStatus = geopluginStatus;
    }

    public String getGeopluginDelay() {
        return geopluginDelay;
    }

    public void setGeopluginDelay(String geopluginDelay) {
        this.geopluginDelay = geopluginDelay;
    }

    public String getGeopluginCredit() {
        return geopluginCredit;
    }

    public void setGeopluginCredit(String geopluginCredit) {
        this.geopluginCredit = geopluginCredit;
    }

    public String getGeopluginCity() {
        return geopluginCity;
    }

    public void setGeopluginCity(String geopluginCity) {
        this.geopluginCity = geopluginCity;
    }

    public String getGeopluginRegion() {
        return geopluginRegion;
    }

    public void setGeopluginRegion(String geopluginRegion) {
        this.geopluginRegion = geopluginRegion;
    }

    public String getGeopluginRegionCode() {
        return geopluginRegionCode;
    }

    public void setGeopluginRegionCode(String geopluginRegionCode) {
        this.geopluginRegionCode = geopluginRegionCode;
    }

    public String getGeopluginRegionName() {
        return geopluginRegionName;
    }

    public void setGeopluginRegionName(String geopluginRegionName) {
        this.geopluginRegionName = geopluginRegionName;
    }

    public String getGeopluginAreaCode() {
        return geopluginAreaCode;
    }

    public void setGeopluginAreaCode(String geopluginAreaCode) {
        this.geopluginAreaCode = geopluginAreaCode;
    }

    public String getGeopluginDmaCode() {
        return geopluginDmaCode;
    }

    public void setGeopluginDmaCode(String geopluginDmaCode) {
        this.geopluginDmaCode = geopluginDmaCode;
    }

    public String getGeopluginCountryCode() {
        return geopluginCountryCode;
    }

    public void setGeopluginCountryCode(String geopluginCountryCode) {
        this.geopluginCountryCode = geopluginCountryCode;
    }

    public String getGeopluginCountryName() {
        return geopluginCountryName;
    }

    public void setGeopluginCountryName(String geopluginCountryName) {
        this.geopluginCountryName = geopluginCountryName;
    }

    public Integer getGeopluginInEU() {
        return geopluginInEU;
    }

    public void setGeopluginInEU(Integer geopluginInEU) {
        this.geopluginInEU = geopluginInEU;
    }

    public Boolean getGeopluginEuVATrate() {
        return geopluginEuVATrate;
    }

    public void setGeopluginEuVATrate(Boolean geopluginEuVATrate) {
        this.geopluginEuVATrate = geopluginEuVATrate;
    }

    public String getGeopluginContinentCode() {
        return geopluginContinentCode;
    }

    public void setGeopluginContinentCode(String geopluginContinentCode) {
        this.geopluginContinentCode = geopluginContinentCode;
    }

    public String getGeopluginContinentName() {
        return geopluginContinentName;
    }

    public void setGeopluginContinentName(String geopluginContinentName) {
        this.geopluginContinentName = geopluginContinentName;
    }

    public String getGeopluginLatitude() {
        return geopluginLatitude;
    }

    public void setGeopluginLatitude(String geopluginLatitude) {
        this.geopluginLatitude = geopluginLatitude;
    }

    public String getGeopluginLongitude() {
        return geopluginLongitude;
    }

    public void setGeopluginLongitude(String geopluginLongitude) {
        this.geopluginLongitude = geopluginLongitude;
    }

    public String getGeopluginLocationAccuracyRadius() {
        return geopluginLocationAccuracyRadius;
    }

    public void setGeopluginLocationAccuracyRadius(String geopluginLocationAccuracyRadius) {
        this.geopluginLocationAccuracyRadius = geopluginLocationAccuracyRadius;
    }

    public String getGeopluginTimezone() {
        return geopluginTimezone;
    }

    public void setGeopluginTimezone(String geopluginTimezone) {
        this.geopluginTimezone = geopluginTimezone;
    }

    public String getGeopluginCurrencyCode() {
        return geopluginCurrencyCode;
    }

    public void setGeopluginCurrencyCode(String geopluginCurrencyCode) {
        this.geopluginCurrencyCode = geopluginCurrencyCode;
    }

    public String getGeopluginCurrencySymbol() {
        return geopluginCurrencySymbol;
    }

    public void setGeopluginCurrencySymbol(String geopluginCurrencySymbol) {
        this.geopluginCurrencySymbol = geopluginCurrencySymbol;
    }

    public String getGeopluginCurrencySymbolUTF8() {
        return geopluginCurrencySymbolUTF8;
    }

    public void setGeopluginCurrencySymbolUTF8(String geopluginCurrencySymbolUTF8) {
        this.geopluginCurrencySymbolUTF8 = geopluginCurrencySymbolUTF8;
    }

    public Double getGeopluginCurrencyConverter() {
        return geopluginCurrencyConverter;
    }

    public void setGeopluginCurrencyConverter(Double geopluginCurrencyConverter) {
        this.geopluginCurrencyConverter = geopluginCurrencyConverter;
    }

    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }
}
