import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MaComponent } from './ma.component';

describe('MaComponent', () => {
  let component: MaComponent;
  let fixture: ComponentFixture<MaComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [MaComponent]
    });
    fixture = TestBed.createComponent(MaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
