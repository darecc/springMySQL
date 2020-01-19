package dc.springh2.controller;

import dc.springh2.PrivateAccount;
import dc.springh2.dao.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
public class PrivateAccountController {
    @Autowired
    AccountRepository repository;

    @RequestMapping("/")
    public String home() {
        return "home.jsp";
    }

    @RequestMapping("/addAccount")
    public String addAccount(PrivateAccount acc) {
        repository.save(acc);
        return "home.jsp";
    }

    @RequestMapping("/display")
    public ModelAndView display() {
        ModelAndView model = new ModelAndView("display.jsp");
        model.addObject("name", "Dariusz");
        return model;
    }
    @RequestMapping("/displayAll")
    public ModelAndView displayAll() {
        Iterable<PrivateAccount> lista = repository.findAll();
        ModelAndView model = new ModelAndView("displayAll.jsp");
        model.addObject("accounts", lista);
        return model;
    }
    @RequestMapping("/displayAllAccounts")
    @ResponseBody
    public String getAccounts() {
        return repository.findAll().toString();
    }

    @RequestMapping("/displayAccount")
    public ModelAndView getAccount(@RequestParam int aid) {
        ModelAndView mv = new ModelAndView("displayAccount.jsp");
        Optional<PrivateAccount> account = repository.findById(aid);
        mv.addObject("account", account);
        return mv;
    }
    @RequestMapping("/deleteAccount")
    public ModelAndView deleteAccount(@RequestParam int aid) {
        Optional<PrivateAccount> konto = repository.findById(aid);
        String nazwa = konto.get().getName();
        double kwota = konto.get().getBalance();
        repository.deleteById(aid);
        ModelAndView model = new ModelAndView("deletedAccount.jsp");
        model.addObject("name", nazwa);
        model.addObject("balance", kwota);
        return model;
    }
    @RequestMapping("/updateAccount")
    public ModelAndView updateAccount(@RequestParam int aid, @RequestParam double value) {
        Optional<PrivateAccount> konto = repository.findById(aid);
        PrivateAccount kontoA= konto.get();
        double kwota = konto.get().getBalance() - value;
        kontoA.setBalance(kwota);
        repository.save(kontoA);
        ModelAndView model = new ModelAndView("updateAccount.jsp");
        model.addObject("name", kontoA.getName());
        model.addObject("amount", value);
        model.addObject("updatedValue", kwota);
        return model;
    }
    public List<PrivateAccount> listAll() {
        return (List<PrivateAccount>)repository.findAll();
    }
}
