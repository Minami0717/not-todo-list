package com.green.nottodolist.data;


import com.green.nottodolist.data.model.DataMainVo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/data")
@RequiredArgsConstructor
@Tag(name = "그래프 페이지")
public class DataController {
    private final DataService service;

    @GetMapping
    @Operation(summary = "그래프 데이터 조회")
    public DataMainVo getDataMain(@RequestParam int memberId) {
        return service.selDataMain(memberId);
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
