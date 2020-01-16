define({ "api": [
  {
    "type": "get",
    "url": "/apidoc3",
    "title": "",
    "description": "<p>apidoc测试接口1</p>",
    "group": "Order2_APIs",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "name",
            "description": "<p>用户名称</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "age",
            "description": "<p>用户年龄</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "请求参数格式:",
          "content": "?name=zqh&age=18",
          "type": "json"
        }
      ]
    },
    "version": "1.0.0",
    "success": {
      "examples": [
        {
          "title": "正确返回值:",
          "content": "{\n    \" name\": \"zxl\"\n    \" age\": 18\n }",
          "type": "json"
        }
      ]
    },
    "error": {
      "examples": [
        {
          "title": "错误返回值:",
          "content": "{\n     \"state\":\"0\",\n     \"message\":\"查询失败\",\n     \"data\":\"\"\n}",
          "type": "json"
        }
      ]
    },
    "sampleRequest": [
      {
        "url": "/projectName/apidoc3"
      }
    ],
    "filename": "src/main/java/org/zxl/springbootdemo/apidoc/controller/ApidocController.java",
    "groupTitle": "Order2_APIs",
    "name": "GetApidoc3"
  },
  {
    "type": "get",
    "url": "/apidoc1",
    "title": "",
    "description": "<p>apidoc测试接口1</p>",
    "group": "Order_APIs",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "name",
            "description": "<p>用户名称</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "age",
            "description": "<p>用户年龄</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "请求参数格式:",
          "content": "?name=zqh&age=18",
          "type": "json"
        }
      ]
    },
    "version": "1.0.0",
    "success": {
      "examples": [
        {
          "title": "正确返回值:",
          "content": "{\n    \" name\": \"zxl\"\n    \" age\": 18\n }",
          "type": "json"
        }
      ]
    },
    "error": {
      "examples": [
        {
          "title": "错误返回值:",
          "content": "{\n     \"state\":\"0\",\n     \"message\":\"查询失败\",\n     \"data\":\"\"\n}",
          "type": "json"
        }
      ]
    },
    "sampleRequest": [
      {
        "url": "/projectName/apidoc1"
      }
    ],
    "filename": "src/main/java/org/zxl/springbootdemo/apidoc/controller/ApidocController.java",
    "groupTitle": "Order_APIs",
    "name": "GetApidoc1"
  },
  {
    "type": "get",
    "url": "/apidoc2",
    "title": "",
    "description": "<p>apidoc测试接口1</p>",
    "group": "Order_APIs",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "name",
            "description": "<p>用户名称</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "age",
            "description": "<p>用户年龄</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "请求参数格式:",
          "content": "?name=zqh&age=18",
          "type": "json"
        }
      ]
    },
    "version": "1.0.0",
    "success": {
      "examples": [
        {
          "title": "正确返回值:",
          "content": "{\n    \" name\": \"zxl\"\n    \" age\": 18\n }",
          "type": "json"
        }
      ]
    },
    "error": {
      "examples": [
        {
          "title": "错误返回值:",
          "content": "{\n     \"state\":\"0\",\n     \"message\":\"查询失败\",\n     \"data\":\"\"\n}",
          "type": "json"
        }
      ]
    },
    "sampleRequest": [
      {
        "url": "/projectName/apidoc2"
      }
    ],
    "filename": "src/main/java/org/zxl/springbootdemo/apidoc/controller/ApidocController.java",
    "groupTitle": "Order_APIs",
    "name": "GetApidoc2"
  }
] });
