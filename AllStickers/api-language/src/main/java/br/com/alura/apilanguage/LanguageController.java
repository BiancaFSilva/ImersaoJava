package br.com.alura.apilanguage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LanguageController 
{
    /* 
    private List<Language> linguagens =
        List.of(
            new Language("Java", "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/java/java_256x256.png", 1),
            new Language("Python", "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/python/python_256x256.png", 2),
            new Language("PHP", "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/php/php_256x256.png", 3)
        );
    
    @GetMapping(value = "/fav-lang")
    public String processaLinguagemPreferida() {
        return "Hello, Java world!";
    }
    */

    @Autowired
    private LanguageRepository repositorio;

    @GetMapping("/langs")
    public List<Language> obterLinguagens() {
        List<Language> linguagens = repositorio.findAll();
        return linguagens;
    }

    @PostMapping("/langs")
    public Language cadastrarLinguagem(@RequestBody Language linguagem) {
        Language linguagemSalva = repositorio.save(linguagem);
        return linguagemSalva;
    }
}