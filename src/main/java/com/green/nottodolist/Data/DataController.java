package com.green.nottodolist.Data;


import com.green.nottodolist.Data.model.DataMainVo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data")
@RequiredArgsConstructor
public class DataController {
    private final DataService service;

    @GetMapping("/datamain")
    public DataMainVo getDataMain(){
        return service.selDataMain();

    }


    //    @GetMapping("/weeklytime")
//    public List<DataWeekSelVo> getSelWeekTime(){
//        return service.selWeeklyTime();
//    }
//
//    @GetMapping("/currentmonthmoney")
//    public List<DataMoneyVo> getselMonthMoney() {
//        return service.selMonthMoney();
//    }
//    @GetMapping("/lastmonthmoney")
//    public Integer getSelLastMonthMoney() {
//        return service.selLastMonthMoney();
//    }
//
//    @GetMapping("/currentmonthtime")
//    public Integer getSelMonthTime(){
//        return service.selMonthTime();
//    }
//    @GetMapping("/lastmonthtime")
//    public Integer getSellastMonthTime(){
//        return service.selLastMonthTime();
//    }
//

}
