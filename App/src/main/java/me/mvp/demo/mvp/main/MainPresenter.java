package me.mvp.demo.mvp.main;

import me.mvp.frame.di.component.AppComponent;
import me.mvp.frame.frame.simple.BaseSimplePresenter;

public class MainPresenter extends BaseSimplePresenter<MainRepository> {

    // AppComponent
    private AppComponent component;

    public MainPresenter(AppComponent component) {
        super(component.getRepositoryManager().createRepository(MainRepository.class));
        this.component = component;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

    }
}