package one.digitalinnovation.gof.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import one.digitalinnovation.gof.model.Geolocalizacao;

@FeignClient(name = "geoplugin", url = "http://www.geoplugin.net")
public interface GeoPluginService
{
    @GetMapping("/json.gp?ip={geopluginRequest}")
    Geolocalizacao consultarGeolocalizacao(@PathVariable("geopluginRequest") String geopluginRequest);
}
