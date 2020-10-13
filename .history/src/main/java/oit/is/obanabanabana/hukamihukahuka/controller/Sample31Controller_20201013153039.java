package oit.is.oabanabana.hukamihukahuka.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//import oit.is.inudaisuki.springboot_samples.model.Room;

/**
 * /sample3へのリクエストを扱うクラス authenticateの設定をしていれば， /sample3へのアクセスはすべて認証が必要になる
 */
@Controller
@RequestMapping("/sample3")
public class Sample31Controller {

  @Autowired
  private Room room;

  @GetMapping("step1")
  public String sample31() {
    return "sample31.html";
  }

  @GetMapping("step3")
  public String sample33() {
    return "sample33.html";
  }

  @GetMapping("step7")
  public String sample37() {
    return "sample37.html";
  }

}
