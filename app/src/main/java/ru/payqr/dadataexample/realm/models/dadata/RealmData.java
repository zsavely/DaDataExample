/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2015 Savelii Zagurskii
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package ru.payqr.dadataexample.realm.models.dadata;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * @author Savelii Zagurskii
 */
public class RealmData extends RealmObject {

    @PrimaryKey
    private String uuid;

    private String qc_complete;
    private String qc_house;
    private String qc_geo;
    private String postal_code;
    private String postal_box;
    private String country;
    private String region_with_type;
    private String region_type;
    private String region_type_full;
    private String region;
    private String area_with_type;
    private String area_type;
    private String area_type_full;
    private String area;
    private String city_with_type;
    private String city_type;
    private String city_type_full;
    private String city;
    private String city_district;
    private String settlement_with_type;
    private String settlement_type;
    private String settlement_type_full;
    private String settlement;
    private String street_with_type;
    private String street_type;
    private String street_type_full;
    private String street;
    private String house_type;
    private String house_type_full;
    private String house;
    private String block_type;
    private String block;
    private String flat_area;
    private String flat_type;
    private String flat;
    private String fias_id;
    private String fias_level;
    private String kladr_id;
    private String tax_office;
    private String tax_office_legal;
    private String capital_marker;
    private String okato;
    private String oktmo;
    private String geo_lat;
    private String geo_lon;
    private String unparsed_parts;
    private String qc;

    public String getQc_complete() {
        return qc_complete;
    }

    public void setQc_complete(String qc_complete) {
        this.qc_complete = qc_complete;
    }

    public String getQc_house() {
        return qc_house;
    }

    public void setQc_house(String qc_house) {
        this.qc_house = qc_house;
    }

    public String getQc_geo() {
        return qc_geo;
    }

    public void setQc_geo(String qc_geo) {
        this.qc_geo = qc_geo;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public String getPostal_box() {
        return postal_box;
    }

    public void setPostal_box(String postal_box) {
        this.postal_box = postal_box;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion_with_type() {
        return region_with_type;
    }

    public void setRegion_with_type(String region_with_type) {
        this.region_with_type = region_with_type;
    }

    public String getRegion_type() {
        return region_type;
    }

    public void setRegion_type(String region_type) {
        this.region_type = region_type;
    }

    public String getRegion_type_full() {
        return region_type_full;
    }

    public void setRegion_type_full(String region_type_full) {
        this.region_type_full = region_type_full;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getArea_with_type() {
        return area_with_type;
    }

    public void setArea_with_type(String area_with_type) {
        this.area_with_type = area_with_type;
    }

    public String getArea_type() {
        return area_type;
    }

    public void setArea_type(String area_type) {
        this.area_type = area_type;
    }

    public String getArea_type_full() {
        return area_type_full;
    }

    public void setArea_type_full(String area_type_full) {
        this.area_type_full = area_type_full;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity_with_type() {
        return city_with_type;
    }

    public void setCity_with_type(String city_with_type) {
        this.city_with_type = city_with_type;
    }

    public String getCity_type() {
        return city_type;
    }

    public void setCity_type(String city_type) {
        this.city_type = city_type;
    }

    public String getCity_type_full() {
        return city_type_full;
    }

    public void setCity_type_full(String city_type_full) {
        this.city_type_full = city_type_full;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity_district() {
        return city_district;
    }

    public void setCity_district(String city_district) {
        this.city_district = city_district;
    }

    public String getSettlement_with_type() {
        return settlement_with_type;
    }

    public void setSettlement_with_type(String settlement_with_type) {
        this.settlement_with_type = settlement_with_type;
    }

    public String getSettlement_type() {
        return settlement_type;
    }

    public void setSettlement_type(String settlement_type) {
        this.settlement_type = settlement_type;
    }

    public String getSettlement_type_full() {
        return settlement_type_full;
    }

    public void setSettlement_type_full(String settlement_type_full) {
        this.settlement_type_full = settlement_type_full;
    }

    public String getSettlement() {
        return settlement;
    }

    public void setSettlement(String settlement) {
        this.settlement = settlement;
    }

    public String getStreet_with_type() {
        return street_with_type;
    }

    public void setStreet_with_type(String street_with_type) {
        this.street_with_type = street_with_type;
    }

    public String getStreet_type() {
        return street_type;
    }

    public void setStreet_type(String street_type) {
        this.street_type = street_type;
    }

    public String getStreet_type_full() {
        return street_type_full;
    }

    public void setStreet_type_full(String street_type_full) {
        this.street_type_full = street_type_full;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse_type() {
        return house_type;
    }

    public void setHouse_type(String house_type) {
        this.house_type = house_type;
    }

    public String getHouse_type_full() {
        return house_type_full;
    }

    public void setHouse_type_full(String house_type_full) {
        this.house_type_full = house_type_full;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getBlock_type() {
        return block_type;
    }

    public void setBlock_type(String block_type) {
        this.block_type = block_type;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getFlat_area() {
        return flat_area;
    }

    public void setFlat_area(String flat_area) {
        this.flat_area = flat_area;
    }

    public String getFlat_type() {
        return flat_type;
    }

    public void setFlat_type(String flat_type) {
        this.flat_type = flat_type;
    }

    public String getFlat() {
        return flat;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }

    public String getFias_id() {
        return fias_id;
    }

    public void setFias_id(String fias_id) {
        this.fias_id = fias_id;
    }

    public String getFias_level() {
        return fias_level;
    }

    public void setFias_level(String fias_level) {
        this.fias_level = fias_level;
    }

    public String getKladr_id() {
        return kladr_id;
    }

    public void setKladr_id(String kladr_id) {
        this.kladr_id = kladr_id;
    }

    public String getTax_office() {
        return tax_office;
    }

    public void setTax_office(String tax_office) {
        this.tax_office = tax_office;
    }

    public String getTax_office_legal() {
        return tax_office_legal;
    }

    public void setTax_office_legal(String tax_office_legal) {
        this.tax_office_legal = tax_office_legal;
    }

    public String getCapital_marker() {
        return capital_marker;
    }

    public void setCapital_marker(String capital_marker) {
        this.capital_marker = capital_marker;
    }

    public String getOkato() {
        return okato;
    }

    public void setOkato(String okato) {
        this.okato = okato;
    }

    public String getOktmo() {
        return oktmo;
    }

    public void setOktmo(String oktmo) {
        this.oktmo = oktmo;
    }

    public String getGeo_lat() {
        return geo_lat;
    }

    public void setGeo_lat(String geo_lat) {
        this.geo_lat = geo_lat;
    }

    public String getGeo_lon() {
        return geo_lon;
    }

    public void setGeo_lon(String geo_lon) {
        this.geo_lon = geo_lon;
    }

    public String getUnparsed_parts() {
        return unparsed_parts;
    }

    public void setUnparsed_parts(String unparsed_parts) {
        this.unparsed_parts = unparsed_parts;
    }

    public String getQc() {
        return qc;
    }

    public void setQc(String qc) {
        this.qc = qc;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}