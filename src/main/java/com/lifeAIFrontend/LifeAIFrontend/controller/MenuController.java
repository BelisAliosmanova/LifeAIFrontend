package com.lifeAIFrontend.LifeAIFrontend.controller;

import com.lifeAIFrontend.LifeAIFrontend.client.ChatClient;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class MenuController {

    private final ChatClient chatClient;

    @GetMapping
    public String redirectHome(Model model) {
        model.addAttribute("dailyReminder", chatClient.receiveDailyReminder());
        return "menu/home";
    }

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("dailyReminder", chatClient.receiveDailyReminder());
        return "menu/home";
    }

    @GetMapping("/info")
    public String info() {
        return "menu/info";
    }

    @GetMapping("/organPreservingSurgery")
    public String organPreservingSurgery() {
        return "menu/organPreservingSurgery";
    }

    @GetMapping("/menopause")
    public String menopause() {
        return "menu/menopause";
    }

    @GetMapping("/recipes")
    public String recipes() {
        return "menu/recipes";
    }

    @GetMapping("/exercises")
    public String exercises() {
        return "menu/exercises";
    }

    @GetMapping("/stickExercises")
    public String stickExercises() {
        return "menu/exercises/stickExercises";
    }

    @GetMapping("/spadeStretching")
    public String spadeStretching() {
        return "menu/exercises/spadeStretching";
    }

    @GetMapping("/shoulderBlades")
    public String shoulderBlades() {
        return "menu/exercises/shoulderBlades";
    }

    @GetMapping("/tiltSide")
    public String tiltSide() {
        return "menu/exercises/tiltSide";
    }

    @GetMapping("/chestStretch")
    public String chestStretch() {
        return "menu/exercises/chestStretch";
    }

    @GetMapping("/shoulderStretch")
    public String shoulderStretch() {
        return "menu/exercises/shoulderStretch";
    }

    @GetMapping("/moreInfoExercises")
    public String moreInfoExercises() {
        return "menu/exercises/moreInfo";
    }

    @GetMapping("/limfedem")
    public String limfedem() {
        return "menu/limfedem";
    }

    @GetMapping("/alternativeMedicine")
    public String alternativeMedicine() {
        return "menu/alternativeMedicine";
    }

    @GetMapping("/diagnosisUploadFile")
    public String understandingDiagnosisUploadFile() {
        return "menu/understandingDiagnosisUploadFile";
    }
}
