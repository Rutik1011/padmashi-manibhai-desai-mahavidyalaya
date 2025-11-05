import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CompscienceComponent } from './compscience.component';

describe('CompscienceComponent', () => {
  let component: CompscienceComponent;
  let fixture: ComponentFixture<CompscienceComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CompscienceComponent]
    });
    fixture = TestBed.createComponent(CompscienceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
