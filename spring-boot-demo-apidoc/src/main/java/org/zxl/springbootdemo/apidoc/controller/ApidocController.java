package org.zxl.springbootdemo.apidoc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ApidocController {
    /**
     * @api {get} /apidoc1
     * @apiDescription apidoc测试接口1
     * @apiGroup Order APIs
     *
     * @apiParam {String} name 用户名称
     * @apiParam {String} age 用户年龄
     *
     * @apiParamExample  请求参数格式:
     *      ?name=zqh&age=18
     *
     * @apiVersion 1.0.0
     *
     * @apiSuccessExample {json} 正确返回值:
     *      {
     *          " name": "zxl"
     *          " age": 18
     *       }
     *
     * @apiErrorExample {json} 错误返回值:
     *      {
     *           "state":"0",
     *           "message":"查询失败",
     *           "data":""
     *      }
     *
     * @apiSampleRequest /projectName/apidoc1
     */
    @GetMapping("/apidoc1")
    public Map apidoc1(@RequestParam(required = false,defaultValue = "zxl") String name , @RequestParam(required = false,defaultValue = "10") int age){
        Map<String,Object> result = new HashMap<>();
        result.put("name", name);
        result.put("age", age);
        return result;
    }



    /**
     * @api {get} /apidoc2
     * @apiDescription apidoc测试接口1
     * @apiGroup Order APIs
     *
     * @apiParam {String} name 用户名称
     * @apiParam {String} age 用户年龄
     *
     * @apiParamExample  请求参数格式:
     *      ?name=zqh&age=18
     *
     * @apiVersion 1.0.0
     *
     * @apiSuccessExample {json} 正确返回值:
     *      {
     *          " name": "zxl"
     *          " age": 18
     *       }
     *
     * @apiErrorExample {json} 错误返回值:
     *      {
     *           "state":"0",
     *           "message":"查询失败",
     *           "data":""
     *      }
     *
     * @apiSampleRequest /projectName/apidoc2
     */
    @GetMapping("/apidoc2")
    public Map apidoc2(@RequestParam(required = false,defaultValue = "zxl") String name , @RequestParam(required = false,defaultValue = "10") int age){
        Map<String,Object> result = new HashMap<>();
        result.put("name", name);
        result.put("age", age);
        return result;
    }

    /**
     * @api {get} /apidoc3
     * @apiDescription apidoc测试接口1
     * @apiGroup Order2 APIs
     *
     * @apiParam {String} name 用户名称
     * @apiParam {String} age 用户年龄
     *
     * @apiParamExample  请求参数格式:
     *      ?name=zqh&age=18
     *
     * @apiVersion 1.0.0
     *
     * @apiSuccessExample {json} 正确返回值:
     *      {
     *          " name": "zxl"
     *          " age": 18
     *       }
     *
     * @apiErrorExample {json} 错误返回值:
     *      {
     *           "state":"0",
     *           "message":"查询失败",
     *           "data":""
     *      }
     *
     * @apiSampleRequest /projectName/apidoc3
     */
    @GetMapping("/apidoc3")
    public Map apidoc3(@RequestParam(required = false,defaultValue = "zxl") String name , @RequestParam(required = false,defaultValue = "10") int age){
        Map<String,Object> result = new HashMap<>();
        result.put("name", name);
        result.put("age", age);
        return result;
    }
}
