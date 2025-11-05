import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AboutsarvodayaComponent } from './aboutsarvodaya.component';

describe('AboutsarvodayaComponent', () => {
  let component: AboutsarvodayaComponent;
  let fixture: ComponentFixture<AboutsarvodayaComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AboutsarvodayaComponent]
    });
    fixture = TestBed.createComponent(AboutsarvodayaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
